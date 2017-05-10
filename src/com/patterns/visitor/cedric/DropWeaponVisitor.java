package com.patterns.visitor.cedric;

public class DropWeaponVisitor implements WeaponVisitor {

	@Override
	public void visit(AK47 ak47) {
		System.out.println("AK Dropped!");
		//TODO: Remove from blondie's wepon's list
	}

	@Override
	public void visit(SniperRifle sniperRifle) {
		System.out.println("Sniper Rifle Dropped!");
		//TODO: Remove from blondie's wepon's list
	}

	@Override
	public void visit(Knife knife) {
		System.out.println("You can't drop your knife, fool!");
	}

}
