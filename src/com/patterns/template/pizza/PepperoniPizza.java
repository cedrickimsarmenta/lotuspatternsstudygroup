/**
 * 
 */
package com.patterns.template.pizza;

/**
 * @author JC
 *
 */
public class PepperoniPizza extends PizzaMaker{

	@Override
	public void chooseBread() {
		System.out.println("Choose bread for PepperoniPizza.");
		
	}
	
	@Override
	public Boolean isThinCrust(){
		return true;
	}

	@Override
	public void addIngredients() {
		System.out.println("Adding ingredients for PepperoniPizza.");
		
	}

	@Override
	public void heating() {
		System.out.println("Heating in 9 mins.");
		
	}

	@Override
	public void addToppings() {
		System.out.println("Adding Pepperoni toppings.");
		
	}

	@Override
	public void servePizza() {
		System.out.println("Serve Pepperoni Pizza.");
		
	}

}
