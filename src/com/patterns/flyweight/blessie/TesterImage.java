package com.patterns.flyweight.blessie;

public class TesterImage extends DefaultImage {
	
	public TesterImage() {
		System.out.println("Loading tester libraries...");
	}

	@Override
	public void performAction() {
		System.out.println("Do tester stuff...");
	}

}
