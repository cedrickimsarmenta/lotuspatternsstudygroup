package com.patterns.cedric.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String args[]) {
		Atm bpiAtm = new Atm("BPI");
		Account account = new Account("Cedric", "PHP");
		
		bpiAtm.addBills(createMultipleBills("PHP", 100, 5));
		bpiAtm.addBills(createMultipleBills("PHP", 1000, 5));
		bpiAtm.printBills();
//		bpiAtm.printBills();
		doWithdraw(bpiAtm, account, 1200);
//		bpiAtm.printBills();
		bpiAtm.printBills();
		account.printBills();
		doWithdraw(bpiAtm, account, 200);
		bpiAtm.printBills();
		account.printBills();
		doWithdraw(bpiAtm, account, 200);
		bpiAtm.printBills();
		account.printBills();
	}
	
	private static void doWithdraw(Atm atm, Account account, Integer amount){
		try {
			atm.withdraw(amount,account);
		} catch (WithdarawalException e) {
			System.out.println(e.getMessage());
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
