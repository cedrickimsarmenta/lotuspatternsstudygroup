package com.patterns.visitor.lex;

public class GoodGuy implements Debtor {
	
    private double loanedAmount;
    
    public GoodGuy(double loanedAmount) {
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
