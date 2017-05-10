package com.patterns.visitor.blessie;

public class FemaleCustomer implements Customer {

	@Override
	public void accept(ExpertBarberVisitor b) {
		System.out.println("Female customer asks for a new hair color");
		System.out.println("Female customer asks for a haircut");		
	}

	@Override
	public void accept(NewbieBarberVisitor b) {
		System.out.println("Female customer asks for a haircut");		
	}

}
