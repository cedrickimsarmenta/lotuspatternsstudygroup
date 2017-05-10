package com.patterns.visitor.kerby;

public interface Visitor {
	
	public void visit(Coffee coffee);
	public void visit(Cake cake);
	public void visit(Tea tea);
}
