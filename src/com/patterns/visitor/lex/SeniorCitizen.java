package com.patterns.visitor.lex;

public class SeniorCitizen implements Debtor {
	
	private double loanedAmount;
	
	public SeniorCitizen(double loanedAmount) {
		this.loanedAmount = loanedAmount;
	}
	

	@Override
	public void accept(CollectLoanVisitor creditor) {
		creditor.visit(this);
	}


	public double getLoanedAmount() {
		return loanedAmount;
	}
	
	

}
