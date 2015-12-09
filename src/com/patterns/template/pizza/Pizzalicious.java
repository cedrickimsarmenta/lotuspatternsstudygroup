/**
 * 
 */
package com.patterns.template.pizza;

/**
 * @author JC
 *
 */
public class Pizzalicious {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HawaiianPizza spicyPizza = new HawaiianPizza();
		spicyPizza.preparePizza();
		System.out.println( );
		PepperoniPizza pepperoniPizza = new PepperoniPizza();
		pepperoniPizza.preparePizza();

	}

}
