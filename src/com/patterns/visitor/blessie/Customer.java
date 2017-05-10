package com.patterns.visitor.blessie;

public interface Customer {
	
	public void accept(ExpertBarberVisitor b);
	public void accept(NewbieBarberVisitor b);

}
