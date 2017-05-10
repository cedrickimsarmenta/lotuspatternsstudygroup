package com.patterns.ralph.visitor;

public class NormalKey implements Key{

	@Override
	public int getLevel() {
		return 1;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
