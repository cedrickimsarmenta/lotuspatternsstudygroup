package com.patterns.ralph.decorator;

public class CheesePizzaDecorator extends PizzaDecorator{
	
	private Pizza pizza; 
	
	public CheesePizzaDecorator(Pizza pizza){
		this.pizza = pizza;
	}
	public double getPrice(){
		return pizza.getPrice() + 7;
		
	}
	public String getCurrency(){
		return pizza.getCurrency();
		
	}
	public String getDescription(){
		return pizza.getDescription()+" and added Cheese";
		
	}
}
