package com.patterns.chainofresponsibility.kerby;

public class CoffeeAdder implements CoffeMaker {

	private CoffeMaker coffeeMaker;
	@Override
	public void processCoffee(CupOfCoffee cupOfCoffee) throws Exception {
		CoffeeType coffeeType = CoffeeType.getWaterLevelByType(cupOfCoffee.getCoffeeOptionNum());
		Coffee coffee = new Coffee(coffeeType);
		System.out.println("Adding coffee with coffeeType: " +  coffeeType.toString());
		cupOfCoffee.getIngredients().add(coffee);
		this.coffeeMaker.processCoffee(cupOfCoffee);
	}
	@Override
	public void setNextChain(CoffeMaker coffee) {
		this.coffeeMaker = coffee;
	}
}
