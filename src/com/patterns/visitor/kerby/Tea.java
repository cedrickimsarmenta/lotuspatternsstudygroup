package com.patterns.visitor.kerby;

public class Tea implements Visitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
