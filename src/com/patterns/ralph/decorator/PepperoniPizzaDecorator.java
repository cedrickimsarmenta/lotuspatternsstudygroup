package com.patterns.ralph.decorator;

public class PepperoniPizzaDecorator extends PizzaDecorator{
	
	private Pizza pizza; 
	
	public PepperoniPizzaDecorator(Pizza pizza){
		this.pizza = pizza;
	}
	public double getPrice(){
		return pizza.getPrice() + 5;
		
	}
	public String getCurrency(){
		return pizza.getCurrency();
		
	}
	public String getDescription(){
		return pizza.getDescription()+" and added Pepperoni";
		
	}
}
