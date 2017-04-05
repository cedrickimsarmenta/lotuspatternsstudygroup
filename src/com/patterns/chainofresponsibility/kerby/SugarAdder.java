package com.patterns.chainofresponsibility.kerby;

public class SugarAdder implements CoffeMaker {
	private CoffeMaker coffeeMaker;
	@Override
	public void processCoffee(CupOfCoffee cupOfCoffee) throws Exception {
		Sugar sugar = new Sugar();
		sugar.setSugarLevel(cupOfCoffee.getSugarLevel());
		System.out.println("Adding sugar with level: " +cupOfCoffee.getSugarLevel());
		cupOfCoffee.getIngredients().add(sugar);
	}

	@Override
	public void setNextChain(CoffeMaker coffee) {
		this.coffeeMaker = coffee;

	}

}
