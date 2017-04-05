package com.patterns.chainofresponsibility.kerby;

import java.util.Scanner;

public class CoffeeVendingMachine {
	
	private CoffeMaker coffeeMaker;
	
	public CoffeeVendingMachine(){
		this.coffeeMaker = new WaterAdder();
		CoffeMaker coffeeMaker2 = new CoffeeAdder();
		CoffeMaker coffeeMaker3 = new CreamAdder();
		CoffeMaker coffeeMaker4 = new SugarAdder();
		coffeeMaker.setNextChain(coffeeMaker2);
		coffeeMaker2.setNextChain(coffeeMaker3);
		coffeeMaker3.setNextChain(coffeeMaker4);
	}
	
	public static void main(String[] args) {
		CoffeeVendingMachine coffeeVendingMachine = new CoffeeVendingMachine();
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Select sugar level [1 to 10]");
			int sugarLevel = input.nextInt();
			if(sugarLevel > 10){
				System.out.println("Invalid sugar level");
				continue;
			}
			System.out.println("Select coffee");
			System.out.println("[1]: BARAKO");
			System.out.println("[2]: MAKIYATO");
			System.out.println("[3]: ESPRESSO");
			System.out.println("[4]: BARBELL");
			int optionNumber = input.nextInt();
			
			// process the request
			try {
				coffeeVendingMachine.coffeeMaker.processCoffee(new CupOfCoffee(sugarLevel, optionNumber));
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
	}

}
