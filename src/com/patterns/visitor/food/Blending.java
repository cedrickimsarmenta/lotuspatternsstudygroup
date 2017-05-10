package com.patterns.visitor.food;

public class Blending implements PreparationMethod {

	@Override
	public void process(Ingredient ingredient) {
		System.out.println("A mess");
		
	}

	@Override
	public void process(Potato potato) {
		System.out.println("Mashed potatoes again?");
		
	}

	@Override
	public void process(Chicken chicken) {
		System.out.println("Chicken puree");
	}

	@Override
	public void process(Fish fish) {
		System.out.println("Fish juice");
	}

	@Override
	public void process(Egg egg) {
		System.out.println("Uncooked scrambled egg.");
		
	}

	

}
