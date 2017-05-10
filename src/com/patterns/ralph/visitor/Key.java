package com.patterns.ralph.visitor;

public interface Key {
	
	public int getLevel();
	
	public void accept(Visitor visitor);
}
