package com.patterns.visitor.food;

public class Frying implements PreparationMethod {

	@Override
	public void process(Ingredient ingredient) {
		System.out.println("Fried something");

	}

	@Override
	public void process(Potato potato) {
		System.out.println("French fries... or hash browns");
	}

	@Override
	public void process(Chicken chicken) {
		System.out.println("Fried chicken");
	}

	@Override
	public void process(Fish fish) {
		System.out.println("Fried fish...");

	}

	@Override
	public void process(Egg egg) {
		System.out.println("Sunny side up");

	}

}
