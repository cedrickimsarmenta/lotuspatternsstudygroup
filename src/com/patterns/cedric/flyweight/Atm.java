package com.patterns.cedric.flyweight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Atm {
	private Map<String, List<Bill>> billsPerCurrency = new HashMap<>();
	
	public void reload(List<Bill> bills) {
		for (Bill bill : bills) {
			if(billsPerCurrency.get(bill.getCurrencyCode()) == null) {
				billsPerCurrency.put(bill.getCurrencyCode(), new ArrayList<>());
			}
			billsPerCurrency.get(bill.getCurrencyCode()).add(bill);
		}
	}
	
	public List<Bill> withdraw(String currency, Integer amount) throws WithdarawalException {
		List<Bill> bills = new ArrayList<Bill>();
		
		synchronized (billsPerCurrency) {
			List<Bill> availableBills = billsPerCurrency.get(currency);
			if(availableBills == null || availableBills.size() == 0) {
				throw new WithdarawalException("Un-able to process transaction. Sorry for the inconvenience. (This atm poor lol!)");
			}
			
			//We may need to rollback
			List<Bill> originalBills = new ArrayList<>();
			originalBills.addAll(originalBills);
			
			java.util.Collections.sort(availableBills, new Comparator<Bill>() {
				@Override
				public int compare(Bill o1, Bill o2) {
					return o2.getAmount().compareTo(o1.getAmount());
				}
			});
			
			Bill smallestBill = availableBills.get(availableBills.size()-1);
			if(amount < smallestBill.getAmount()) {
				//The amount requested is smaller than the smallest bill
				throw new WithdarawalException("Un-able to process transaction. Please choose amount at least " + smallestBill.getAmount());
			}
			Iterator<Bill> billsIterator =  availableBills.iterator();
			while(billsIterator.hasNext()) {
				Bill bill = billsIterator.next();
				if(amount - bill.getAmount() >= 0) {
					amount -= bill.getAmount();
					bills.add(bill);
					billsIterator.remove();
					if(amount == 0) {
						break;
					}
				}
			}
			

			if(amount != 0) {
				if(availableBills.size()  == 0) {
					//We still need to give out money, but we are out of bills
					//Roll back 
					this.billsPerCurrency.put(currency, originalBills);
					throw new WithdarawalException("Un-able to process transaction. Sorry for the inconvenience. (This atm poor lol!)");
				} else {
					//We still need to give out money, we still have bills, but cannot pass the amount
					//Roll back 
					this.billsPerCurrency.put(currency, originalBills);
					throw new WithdarawalException("Un-able to process transaction. Please choose a different amount.");
				}
			}
			
			
		}
		
		return bills;
	}
	
	public void printBills() {
		for(String currency : billsPerCurrency.keySet()) {
			System.out.println("Bills for " + currency + ":");
			Integer total = 0;
			for(Bill bill: billsPerCurrency.get(currency)) {
				System.out.println("Bill: " + bill);
				total += bill.getAmount();
			}
			
			System.out.println("Total: " + total);
		}
	}
}
