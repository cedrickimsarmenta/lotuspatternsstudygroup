package com.patterns.visitor.cedric;

public interface WeaponVisitor {
	public void visit(AK47 ak47);
	public void visit(SniperRifle sniperRifle);
	public void visit(Knife knife);
	
}
