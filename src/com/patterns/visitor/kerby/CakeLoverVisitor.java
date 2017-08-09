package com.patterns.visitor.kerby;

public class CakeLoverVisitor implements Visitor {
	
	@Override
	public void visit(Coffee coffee) {
		
	}

	@Override
	public void visit(Cake cake) {
		System.out.println("Cake has been ordered.");
	}

	@Override
	public void visit(Tea tea) {
	}

}
