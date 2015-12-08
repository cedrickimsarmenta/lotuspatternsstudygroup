package com.patterns.template.silog;

public class BaconSilog extends Silog {
	private boolean alacarte;
	
	public BaconSilog(boolean alacarte) {
		super();
		this.alacarte = alacarte;
	}

	@Override
	protected boolean includeEgg() {
		return !alacarte;
	}

	@Override
	protected void cookMain() {
		System.out.println("Cooking bacon...");
	}
}
