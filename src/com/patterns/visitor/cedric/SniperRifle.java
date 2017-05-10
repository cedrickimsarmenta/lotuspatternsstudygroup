package com.patterns.visitor.cedric;

public class SniperRifle extends AbstractWeapon {
	private int scopeLevel = 1;
	
	
	protected SniperRifle() {
		super("Sniper Rifle", 10, 10);
	}
	
	public void scope() {
		if(scopeLevel < 3) {
			scopeLevel ++;
		} else {
			scopeLevel = 1;
		}
		
		
		String scopeInfo = null;
		
		switch (scopeLevel) {
			case 1:
				scopeInfo = "Kzzt. Not Scoped";
				break;
			case 2:
				scopeInfo = "Kzzt. Scoped @ 50 %";
				break;
			case 3:
				scopeInfo = "Kzzt. Scoped @ 100 %";
				break;
				
		}
		System.out.println(scopeInfo);
	}

	@Override
	public void accept(WeaponVisitor visitor) {
		visitor.visit(this);
	}

}
