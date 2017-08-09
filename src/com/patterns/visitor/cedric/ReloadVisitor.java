package com.patterns.visitor.cedric;

public class ReloadVisitor implements WeaponVisitor {

	@Override
	public void visit(AK47 ak47) {
		System.out.println("Replacing the magazine.. ");
		ak47.setRemainingRounds(ak47.getMaxRounds());
		System.out.println("New ammo count: " + ak47.getRemainingRounds());
	}

	@Override
	public void visit(SniperRifle sniperRifle) {
		System.out.println("Replacing the magazine.. ");
		sniperRifle.setRemainingRounds(sniperRifle.getMaxRounds());
		System.out.println("New ammo count: " + sniperRifle.getRemainingRounds());
	}

	@Override
	public void visit(Knife knife) {
		//You cant reload a knife fool!
	}

}
