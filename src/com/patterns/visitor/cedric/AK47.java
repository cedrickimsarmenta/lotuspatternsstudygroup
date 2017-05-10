package com.patterns.visitor.cedric;

public class AK47 extends AbstractWeapon {

	protected AK47() {
		super("AK47", 30, 30);
	}

	@Override
	public void accept(WeaponVisitor visitor) {
		visitor.visit(this);
	}


}
