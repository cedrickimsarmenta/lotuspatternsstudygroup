package com.patterns.chainofresponsibility.kerby;

public class WaterAdder implements CoffeMaker {
	private CoffeMaker coffeeMaker;
	@Override
	public void processCoffee(CupOfCoffee cupOfCoffee) throws Exception {
		CoffeeType coffeeType = CoffeeType.getWaterLevelByType(cupOfCoffee.getCoffeeOptionNum());
		Water water = new Water(coffeeType.getWaterLevel());
		System.out.println("Adding water with waterlevel: " +  water.getWaterLevel());
		cupOfCoffee.getIngredients().add(water);
		this.coffeeMaker.processCoffee(cupOfCoffee);
	}

	@Override
	public void setNextChain(CoffeMaker coffee) {
		this.coffeeMaker = coffee;
	}

}
