package com.patterns.ralph.visitor;

public class MasterKey implements Key{

	@Override
	public int getLevel() {
		return 3;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
