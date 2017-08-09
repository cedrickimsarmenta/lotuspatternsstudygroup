package com.patterns.visitor.cedric;

public class Attack1Visitor implements WeaponVisitor {

	@Override
	public void visit(AK47 ak47) {
		if(ak47.getRemainingRounds() > 0) {
			System.out.println("BABANG!");
			ak47.setRemainingRounds(ak47.getRemainingRounds()-1);
			System.out.println("Remaining bullets: "  + ak47.getRemainingRounds());
			
		} else {
			System.out.println("Chuk chuk chuch -- out of Ammo!");
		}
	}

	@Override
	public void visit(SniperRifle sniperRifle) {
		if(sniperRifle.getRemainingRounds() > 0) {
			System.out.println("POW!");
			sniperRifle.setRemainingRounds(sniperRifle.getRemainingRounds()-1);
			System.out.println("Remaining bullets: "  + sniperRifle.getRemainingRounds());
			
		} else {
			System.out.println("Chuk chuk chuch -- out of Ammo!");
		}

	}

	@Override
	public void visit(Knife knife) {
		System.out.println("wa-shing! Wa-shing!");
	}

}
