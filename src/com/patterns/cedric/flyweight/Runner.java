package com.patterns.cedric.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String args[]) {
		Atm bpiAtm = new Atm();
		bpiAtm.reload(createMultipleBills("PHP", 100, 5));
		bpiAtm.reload(createMultipleBills("PHP", 1000, 5));
//		bpiAtm.printBills();
		printBills(doWithdraw(bpiAtm, "PHP", 1200));
//		bpiAtm.printBills();

		printBills(doWithdraw(bpiAtm, "PHP", 300));

		printBills(doWithdraw(bpiAtm, "PHP", 200));
	}
	
	private static List<Bill> doWithdraw(Atm atm, String currency, Integer amount){
		try {
			return atm.withdraw(currency, amount);
		} catch (WithdarawalException e) {
			System.out.println(e.getMessage());
			
			return new ArrayList<Bill>();
		}
	}
	private static void printBills(List<Bill> bills) {
		System.out.println("Withdarwal info:");
		for(Bill bill: bills) {
			System.out.println("Withdrawn" + bill);
		}
		
	}
	private static List<Bill> createMultipleBills(String currency, Integer denomination, int number) {
		List<Bill> bills = new ArrayList<>();
		for(int i = 0 ; i < number ; i++) {
			bills.add(BangkoCentral.getBill(currency, denomination));
		}
		
		return bills;
	}
}
