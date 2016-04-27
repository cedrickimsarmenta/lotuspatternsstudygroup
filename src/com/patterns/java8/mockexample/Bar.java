package com.patterns.java8.mockexample;

public class Bar {
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Bar [description=" + description + "]";
	}
	
	
}
