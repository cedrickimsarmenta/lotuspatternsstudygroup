package com.patterns.chainofresponsibility.kerby;

public class CreamAdder implements CoffeMaker {
	private CoffeMaker coffeeMaker;
	@Override
	public void processCoffee(CupOfCoffee cupOfCoffee) throws Exception {
		CoffeeType coffeeType = CoffeeType.getWaterLevelByType(cupOfCoffee.getCoffeeOptionNum());
		Cream cream = new Cream(coffeeType.getCreamLevel());
		System.out.println("Adding cream with creamLevel: " +  cream.getCreamLevel());
		cupOfCoffee.getIngredients().add(cream);
		this.coffeeMaker.processCoffee(cupOfCoffee);
	}
	@Override
	public void setNextChain(CoffeMaker coffee) {
		this.coffeeMaker = coffee;
	}
}
