package com.patterns.visitor.blessie;

public class ExpertBarberVisitor implements BarberVisitor{

	@Override
	public void visit(MaleCustomer c) {
		preTreatmentActions(c.getClass().getSimpleName());
		c.accept(this);
		System.out.println("ExpertBarber offers the customer a shave.");
		postTreatmentActions();
	}

	@Override
	public void visit(FemaleCustomer c) {
		preTreatmentActions(c.getClass().getSimpleName());
		System.out.println("ExpertBarber offers the customer a magazine.");
		c.accept(this);
		System.out.println("ExpertBarber offers the customer another hair treatment.");
		postTreatmentActions();
	}
	
	private void postTreatmentActions() {
		System.out.println("ExpertBarber says goodbye.");
		System.out.println("*************************************************");
	}

	private void preTreatmentActions(String customer) {
		System.out.println("*************************************************");
		System.out.println("ExpertBarber got a "+customer);
		System.out.println("ExpertBarber welcomes the customer.");
		System.out.println("ExpertBarber offers the customer a drink.");
	}

	
	
}
