package com.patterns.visitor.lex;

public interface CollectLoanVisitor {
	
	public void visit(GoodGuy goodGuy);

	public void visit(SeniorCitizen seniorCitizen);

	public void visit(Parent parent);
	
	public double getCollections();



}
