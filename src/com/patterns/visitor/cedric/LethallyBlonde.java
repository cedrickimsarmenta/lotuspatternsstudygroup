package com.patterns.visitor.cedric;

import java.util.ArrayList;
import java.util.List;

public class LethallyBlonde {
	public static void main (String[] args) {
		List<Weapon> weapons = new ArrayList<Weapon>();
		weapons.add(new Knife());
		weapons.add(new AK47());
		weapons.add(new SniperRifle());
			
		
		System.out.println("Blondie got some weapons! Lets play! hihi ^_^");
		WeaponVisitor mouse1Visitor = new Attack1Visitor();
		WeaponVisitor mouse2Visitor = new Attack2Visitor();
		WeaponVisitor reloadVisitor = new ReloadVisitor();
		WeaponVisitor dropWeaponVisitor = new DropWeaponVisitor();
		int k = 0;
		
		for(Weapon weapon : weapons) {
			System.out.println("*********************");
			System.out.println("Using: " + weapon.getName());
			k=0;
			//Fire 20 rounds
			//At the 15th round, reload
			for(int i = 0 ; i < 20 ; i ++) {
				weapon.accept(mouse1Visitor);
				
				if(k++ == 15) {
					weapon.accept(reloadVisitor);
				}
			}
			
			//Mouse 2 four times
			for(int i = 0 ; i < 4 ; i ++) {
				weapon.accept(mouse2Visitor);
			}
			
			//Drop the weapon
			weapon.accept(dropWeaponVisitor);
		}
		
	}
}
