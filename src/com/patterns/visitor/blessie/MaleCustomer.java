package com.patterns.visitor.blessie;

public class MaleCustomer implements Customer {

	@Override
	public void accept(BarberVisitor b) {
	    
b.visit(this);
	}

}
