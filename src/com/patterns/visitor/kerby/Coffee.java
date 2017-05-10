package com.patterns.visitor.kerby;

public class Coffee implements Visitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
