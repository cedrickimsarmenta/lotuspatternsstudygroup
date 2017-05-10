package com.patterns.visitor.food;

public class Egg implements Ingredient {

	@Override
	public void prepare(PreparationMethod method) {
		method.process(this);
	}
}
