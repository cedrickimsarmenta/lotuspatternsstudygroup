package com.patterns.flyweight.blessie;

public class DeveloperImage extends DefaultImage {
	
	public DeveloperImage() {
		System.out.println("Loading developer libraries...");
	}

	@Override
	public void performAction() {
		System.out.println("Do developer stuff...");
	}

}
