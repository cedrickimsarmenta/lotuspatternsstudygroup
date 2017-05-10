package com.patterns.ralph.visitor;

public class KeyFactory {

	public static Key getKeyForUser(User user){
		switch (user.getRole()) {
		case KING:
			return new MasterKey();
		case QUEEN:
		case JACK:
			return new SuperKey();
		default:
			return new NormalKey();
		} 
	}
}
