package com.patterns.visitor.kerby;

public class CoffeeLoverVisitor implements Visitor {

	@Override
	public void visit(Coffee coffee) {
		System.out.println("Coffee has been ordered.");
	}

	@Override
	public void visit(Cake cake) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Tea tea) {
		// TODO Auto-generated method stub

	}

}
