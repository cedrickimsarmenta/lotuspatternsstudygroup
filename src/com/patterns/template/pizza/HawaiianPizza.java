/**
 * 
 */
package com.patterns.template.pizza;

/**
 * @author JC
 *
 */
public class HawaiianPizza extends PizzaMaker{

	@Override
	public void chooseBread() {
		System.out.println("Choose bread for HawaiianPizza.");
		
	}

	@Override
	public void addIngredients() {
		System.out.println("Adding ingredients for HawaiianPizza.");
		
	}

	@Override
	public void heating() {
		System.out.println("Heating for 10mins.");
		
	}

	@Override
	public void addToppings() {
		System.out.println("Adding pineapple toppings.");
		
	}
	
	@Override
	public Boolean isSpicy(){
		return true;
	}

	@Override
	public void servePizza() {
		System.out.println("Serve SpicyPizza.");
		
	}

}
