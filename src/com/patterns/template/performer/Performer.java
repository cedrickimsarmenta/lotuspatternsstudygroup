package com.patterns.template.performer;

public abstract class Performer {
	private String name;
	private String talent;
	
	public Performer(String name, String talent) {
		super();
		this.name = name;
		this.talent = talent;
	}

	public void perform() {
		introduce();
		doPerform();
		curtainCall();
		exit();
	}

	protected abstract void doPerform();
	
	protected void introduce() {
		System.out.println("Hi, I'm " + name + ". May talent is: " + talent + ". I hope you like my performance. Here goes!");
	}
	
	protected void curtainCall() {
		System.out.println("That's a wrap hope you liked it! *BOW*");
	}
	
	protected void exit() {
		System.out.println("*Walks off stage.*");
	}
	
}
