package com.patterns.visitor.blessie;

public class Main {
	
	public static void main(String[] args) {
		
		FemaleCustomer female = new FemaleCustomer();
		MaleCustomer male = new MaleCustomer();
		
		BarberVisitor expert = new ExpertBarberVisitor();
//		expert.visit(female);
//		expert.visit(male);
		
		BarberVisitor newbie = new NewbieBarberVisitor();
//		newbie.visit(female);
//		newbie.visit(male);
		female.accept(expert);
		male.accept(expert);
		
		female.accept(newbie);
		male.accept(newbie);
	}

}
