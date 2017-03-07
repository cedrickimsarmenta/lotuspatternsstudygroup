package com.patterns.flyweight.blessie;

public class DefaultImage implements Image {
	
	public DefaultImage() {
		System.out.println("Loading default libraries...");
	}

	@Override
	public void performAction() {
		System.out.println("Do default stuff...");
	}

}
