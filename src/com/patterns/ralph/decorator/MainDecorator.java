package com.patterns.ralph.decorator;

public class MainDecorator {

	public static void main(String[]args){
		Pizza pizza = new  PlainPizza();
		System.out.println("This is a " +pizza.getDescription());
		System.out.println("I am worth "+pizza.getPrice()+pizza.getCurrency());
		Pizza pepperoni = new PepperoniPizzaDecorator(pizza);
		System.out.println("This is a " +pepperoni.getDescription());
		System.out.println("I am worth "+pepperoni.getPrice()+pizza.getCurrency());
		Pizza cheesePizzaDecorator = new CheesePizzaDecorator(pizza);
		System.out.println("This is a " +cheesePizzaDecorator.getDescription());
		System.out.println("I am worth "+cheesePizzaDecorator.getPrice()+pizza.getCurrency());
		
		Pizza cheeseWithPepperoniPizzaDecorator = new CheesePizzaDecorator(pepperoni);
		System.out.println("This is a " +cheeseWithPepperoniPizzaDecorator.getDescription());
		System.out.println("I am worth "+cheeseWithPepperoniPizzaDecorator.getPrice()+pizza.getCurrency());
	}
}
