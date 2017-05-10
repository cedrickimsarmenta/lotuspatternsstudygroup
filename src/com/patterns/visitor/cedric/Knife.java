package com.patterns.visitor.cedric;

public class Knife extends AbstractWeapon {

	protected Knife() {
		super("Knife", null, null);
	}

	@Override
	public void accept(WeaponVisitor visitor) {
		visitor.visit(this);
	}

}
