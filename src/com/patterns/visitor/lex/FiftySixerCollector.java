package com.patterns.visitor.lex;

public class FiftySixerCollector implements CollectLoanVisitor {
	
	private double collections = 0;

	@Override
	public void visit(GoodGuy goodGuy) {
		printCollectingDebtor(goodGuy.getClass().getSimpleName());
		double principal = goodGuy.getLoanedAmount();
		double rate = 0.20;
		double interest = principal * rate;
		double total = principal + interest;
		collections += total;
		printAmount(total);

	}

	@Override
	public void visit(SeniorCitizen seniorCitizen) {
		printCollectingDebtor(seniorCitizen.getClass().getSimpleName());
		double principal = seniorCitizen.getLoanedAmount();
		double seniorRate = 0.10;
		double discount = principal * seniorRate;
		double total = principal - discount;
		collections += principal - discount; 
		printAmount(total);
	}
	

	@Override
	public void visit(Parent parent) {
		printCollectingDebtor(parent.getClass().getSimpleName());
		printAmount(0);
	}
	
	private void printCollectingDebtor(String debtor) {
		System.out.println("Collecting from " + debtor);
	}
	private void printAmount(double amount) {
		System.out.println("Collected amount: " + amount + "\n");

	}

	public double getCollections() {
		return collections;
	}
}
