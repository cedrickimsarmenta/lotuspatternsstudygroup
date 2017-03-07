package com.patterns.flyweight.blessie;

public class ManagerImage extends DefaultImage {
	
	public ManagerImage() {
		System.out.println("Loading manager libraries...");
	}

	@Override
	public void performAction() {
		System.out.println("Do manager stuff...");
	}

}
