package com.patterns.visitor.cedric;

public class Attack2Visitor implements WeaponVisitor {

	@Override
	public void visit(AK47 ak47) {
		//Do nothing, ak doesnt have action for mouse 2
	}

	@Override
	public void visit(SniperRifle sniperRifle) {
		sniperRifle.scope();
	}

	@Override
	public void visit(Knife knife) {
		System.out.println("WA-CHAK!!! (Intense knife stab)");
	}

}
