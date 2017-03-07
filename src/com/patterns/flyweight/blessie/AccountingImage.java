package com.patterns.flyweight.blessie;

public class AccountingImage extends DefaultImage {
	
	public AccountingImage() {
		System.out.println("Loading accounting libraries...");
	}

	@Override
	public void performAction() {
		System.out.println("Do accounting stuff...");
	}

}
