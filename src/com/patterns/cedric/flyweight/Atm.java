package com.patterns.cedric.flyweight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Atm extends AbstractBillOwner {
	protected Atm(String name) {
		super(name);
	}

	private Map<String, List<Bill>> billsPerCurrency = new HashMap<>();
	
	@Override
	public void addBills(List<Bill> bills) {
		for (Bill bill : bills) {
			addBill(bill);
		}
	}
	
	public void withdraw(Integer amount, Account account) throws WithdarawalException {
		
		String currency = account.getCurrency();
		
		synchronized (billsPerCurrency) {
			synchronized (account.getBills()) {
				List<Bill> availableBills = billsPerCurrency.get(currency);
				if(availableBills == null || availableBills.size() == 0) {
					throw new WithdarawalException("Un-able to process transaction. Sorry for the inconvenience. (This atm poor lol!)");
				}
				
				
				List<Bill> billsCopy = new ArrayList<>();
				billsCopy.addAll(availableBills);
				
				//We may need to rollback
				List<Bill> originalBills = new ArrayList<>();
				originalBills.addAll(availableBills);
				
			
				List<Bill> acountBills = new ArrayList<>();
				acountBills.addAll(account.getBills());
				
				java.util.Collections.sort(billsCopy, new Comparator<Bill>() {
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
				for(Bill bill : billsCopy){
					if(amount - bill.getAmount() >= 0) {
						amount -= bill.getAmount();
						bill.transfer(this, account);
						if(amount == 0) {
							break;
						}
					}
				}
				

				if(amount != 0) {
					if(availableBills.size()  == 0) {
						//We still need to give out money, but we are out of bills
						//Roll back 
						this.rollbackTo(originalBills);
						account.rollbackTo(acountBills);
						throw new WithdarawalException("Un-able to process transaction. Sorry for the inconvenience. (This atm poor lol!)");
					} else {
						//We still need to give out money, we still have bills, but cannot pass the amount
						//Roll back 
						this.rollbackTo(originalBills);
						account.rollbackTo(acountBills);
						throw new WithdarawalException("Un-able to process transaction. Please choose a different amount.");
					}
				}
			}
		}
		
	}

	
	@Override
	public List<Bill> getBills() {
		List<Bill> bills = new ArrayList<>();
		for(String currency : billsPerCurrency.keySet()) {
			bills.addAll(billsPerCurrency.get(currency));
		}
		return bills;
	}

	@Override
	public void addBill(Bill bill) {
		if(billsPerCurrency.get(bill.getCurrencyCode()) == null) {
			billsPerCurrency.put(bill.getCurrencyCode(), new ArrayList<>());
		}
		billsPerCurrency.get(bill.getCurrencyCode()).add(bill);		
	}

	@Override
	public void rollbackTo(List<Bill> bills) {
		if(bills.size() > 0) {
			this.billsPerCurrency.put(bills.get(0).getCurrencyCode(), bills);
		}
	}

	@Override
	public void removeBill(Bill bill) {
		if(billsPerCurrency.get(bill.getCurrencyCode()) != null) {
			List<Bill> bills = billsPerCurrency.get(bill.getCurrencyCode());
			int firstOccurance = bills.indexOf(bill);
			
			if(firstOccurance >= 0) {
				bills.remove(firstOccurance);
				return;
			}
			
		}
		
		throw new RuntimeException("Bill does not exist");
		
	}
	
}
