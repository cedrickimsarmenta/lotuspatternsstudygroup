package com.patterns.visitor.food;

public class Chicken implements Ingredient {

	@Override
	public void prepare(PreparationMethod method) {
		method.process(this);
	}

}
