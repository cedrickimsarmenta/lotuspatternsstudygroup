package com.patterns.ralph.decorator;

public class PlainPizza implements Pizza {

	private double price = 10;
	private String currency = "USD";
	private String description = "Plain pizza";
	

	public double getPrice() {
		return price;
	}


	public String getCurrency() {
		return currency;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


}
