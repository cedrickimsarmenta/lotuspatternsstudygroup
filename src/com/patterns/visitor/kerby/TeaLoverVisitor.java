package com.patterns.visitor.kerby;

public class TeaLoverVisitor implements Visitor {

	@Override
	public void visit(Coffee coffee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Cake cake) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Tea tea) {
		System.out.println("Tea has been ordered.");
	}

}
