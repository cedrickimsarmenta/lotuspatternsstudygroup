package com.patterns.template.performer;

public class Guitarist extends Performer {

	public Guitarist(String name) {
		super(name, "playing guitar");
	}

	@Override
	protected void doPerform() {
		System.out.println("Dyeng jigi jigi dyeng dyen dyeng. Ting ting tong tung djeng.");
	}


}
