package com.patterns.visitor.blessie;

public class MaleCustomer implements Customer {

	@Override
	public void accept(ExpertBarberVisitor b) {
		System.out.println("Male customer asks for a haircut");
	}

	@Override
	public void accept(NewbieBarberVisitor b) {
		System.out.println("Male customer asks for a haircut");		
	}

}
