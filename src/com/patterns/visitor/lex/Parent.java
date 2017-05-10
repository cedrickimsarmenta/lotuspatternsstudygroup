package com.patterns.visitor.lex;

public class Parent implements Debtor {
	

	public Parent(double loanedAmount) {
		//TY
	}
	
	@Override
	public void accept(CollectLoanVisitor creditor) {
		creditor.visit(this);
	}

}
