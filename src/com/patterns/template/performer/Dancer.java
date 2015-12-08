package com.patterns.template.performer;

public class Dancer extends Performer {

	public Dancer(String name) {
		super(name, "dancing");
	}

	@Override
	protected void doPerform() {
		System.out.println("Boom. Boom. Pang pang. Yeah! Uhm. Dance.");
	}


}
