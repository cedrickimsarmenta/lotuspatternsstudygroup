package com.patterns.ralph.visitor;

public class DoorVisitor implements Visitor{

	@Override
	public void visit(MasterKey masterkey) {
		System.out.println("You have the master key with level "+ masterkey.getLevel() );
		System.out.println("You can open any door as this key is used by the king");
		
	}

	@Override
	public void visit(SuperKey superKey) {
		System.out.println("You have the super key with level "+ superKey.getLevel() );
		System.out.println("You can open any door except the masters chamber ");
		
	}

	@Override
	public void visit(NormalKey normalKey) {
		System.out.println("You have the normalKey key with level "+ normalKey.getLevel() );
		System.out.println("You can only open the door to your house ");
		
	}

}
