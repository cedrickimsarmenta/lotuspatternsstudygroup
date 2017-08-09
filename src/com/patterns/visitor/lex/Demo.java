package com.patterns.visitor.lex;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Debtor> debtors = new ArrayList<Debtor>();
		debtors.add(new GoodGuy(10000));
		debtors.add(new SeniorCitizen(10000));
		debtors.add(new Parent(10000));
		
		for (Debtor debtor : debtors) {
		    
		}
		
		
		CollectLoanVisitor creditor = new FiftySixerCollector();
		for (Debtor debtor : debtors) {
			debtor.accept(creditor);
		}

		System.out.println(creditor.getCollections());
	}
}
