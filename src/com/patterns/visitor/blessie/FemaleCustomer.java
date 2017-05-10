package com.patterns.visitor.blessie;

public class FemaleCustomer implements Customer {

	@Override
	public void accept(BarberVisitor b) {
		System.out.println("Female customer asks for a new hair color");
		System.out.println("Female customer asks for a haircut");		
	}

}
