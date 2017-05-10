package com.patterns.visitor.food;

public class Boiling implements PreparationMethod {

	@Override
	public void process(Ingredient ingredient) {
		System.out.println("Not entirely sure what this is");

	}

	@Override
	public void process(Potato potato) {
		System.out.println("Boiled potatoes. If you mash them you get mashed potatoes");

	}

	@Override
	public void process(Chicken chicken) {
		System.out.println("Chicken soup. Sort of..");

	}

	@Override
	public void process(Fish fish) {
		System.out.println("Boiled fish. Meh");

	}

	@Override
	public void process(Egg egg) {
		System.out.println("Poached egg...");

	}

}
