package com.patterns.template.silog;

public abstract class Silog {
	public void cook() {
		System.out.println("**START**");
		heatPan();
		cookRice();
		if(includeEgg()) {
			cookEgg();
		}
		cookMain();
		serve();

		System.out.println("**END**");
	}
	
	protected boolean includeEgg() {
		return true;
	}

	protected void heatPan() {
		System.out.println("Heating pan.");
	}
	protected void cookRice() {
		System.out.println("Cooking fried rice");
	}
	protected void cookEgg() {
		System.out.println("Cooking egg");
	}
	protected abstract void cookMain();
	
	protected void serve() {
		System.out.println("Put everything in a plate and serve!");
	}
}
