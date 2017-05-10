package com.patterns.visitor.kerby;

public class Cake implements Visitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
