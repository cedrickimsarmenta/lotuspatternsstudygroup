package com.patterns.visitor.blessie;

public class MaleCustomer implements Customer {

	@Override
	public void accept(BarberVisitor b) {
		System.out.println("Male customer asks for a haircut");
	}

}
