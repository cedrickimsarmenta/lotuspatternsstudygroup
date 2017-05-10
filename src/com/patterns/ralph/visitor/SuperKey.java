package com.patterns.ralph.visitor;

public class SuperKey implements Key{

	@Override
	public int getLevel() {
		return 2;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
}
