package com.patterns.visitor.blessie;

public class FemaleCustomer implements Customer {

	@Override
	public void accept(BarberVisitor b) {
b.visit(this);
	}

}
