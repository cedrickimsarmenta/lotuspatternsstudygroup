package com.patterns.ralph.visitor;

public interface Visitor {

	public void visit(MasterKey masterkey);
	public void visit(SuperKey superKey);
	public void visit(NormalKey normalKey);
}
