package com.patterns.visitor.blessie;

public class Main {
	
	public static void main(String[] args) {
		
		FemaleCustomer female = new FemaleCustomer();
		MaleCustomer male = new MaleCustomer();
		
		ExpertBarberVisitor expert = new ExpertBarberVisitor();
		expert.visit(female);
		expert.visit(male);
		
		NewbieBarberVisitor newbie = new NewbieBarberVisitor();
		newbie.visit(female);
		newbie.visit(male);
	}

}
