package com.patterns.visitor.lex;

public interface Debtor {
	
	public void accept(CollectLoanVisitor creditor);

}
