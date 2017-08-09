package com.patterns.visitor.blessie;

public class NewbieBarberVisitor implements BarberVisitor {

	@Override
	public void visit(MaleCustomer c) {
		preTreatmentActions(c.getClass().getSimpleName());
		System.out.println("NewbieBarber cuts the customer's hair too short.");
		postTreatmentActions();
	}

	@Override
	public void visit(FemaleCustomer c) {
		preTreatmentActions(c.getClass().getSimpleName());
		System.out.println("NewbieBarber forgets to offer the customer a magazine.");
		System.out.println("NewbieBarber makes small talk.");
		postTreatmentActions();
	}
	
	private void postTreatmentActions() {
		System.out.println("NewbieBarber walks away.");
		System.out.println("*************************************************");
	}

	private void preTreatmentActions(String customer) {
		System.out.println("*************************************************");
		System.out.println("NewbieBarber got a "+customer);
		System.out.println("NewbieBarber tells the customer to take a seat.");
	}

}
