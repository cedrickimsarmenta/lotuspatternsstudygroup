/**
 * 
 */
package com.patterns.template.pizza;

/**
 * @author JC
 *
 */
public abstract class PizzaMaker {
	
	public abstract void chooseBread();
	public abstract void addIngredients();
	public abstract void heating();
	public abstract void addToppings();
	public abstract void servePizza();
	public void addChilly(){
		System.out.println("Adding chilly.");
	};
	public Boolean isSpicy(){
		return false;
	};
	
	public Boolean isThinCrust(){
		return false;
	}
	
	public final void preparePizza(){
		
		chooseBread();		
		if (isThinCrust()) {
			System.out.println("Thin crust.");
		}else{
			System.out.println("Thick crust.");			
		}
		
		addIngredients();
		addToppings();
		if (isSpicy()) {
			addChilly();
		}
		heating();
		servePizza();
		
	}
	
	

}
