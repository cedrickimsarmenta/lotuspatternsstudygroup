package com.patterns.visitor.blessie;

public interface BarberVisitor {
	
	public void visit(MaleCustomer c);
	public void visit(FemaleCustomer c);

}
