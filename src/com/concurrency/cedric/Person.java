package com.concurrency.cedric;

public class Person {
	private String name;
	private boolean disabledYN;
	
	protected Person(String name, boolean disabledYN) {
		super();
		this.name = name;
		this.disabledYN = disabledYN;
	}

	public void transact() {
		System.out.println("I AM " + name+ "!! Finally it's my turn!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDisabledYN() {
		return disabledYN;
	}

	public void setDisabledYN(boolean disabledYN) {
		this.disabledYN = disabledYN;
	}
	
	
}
