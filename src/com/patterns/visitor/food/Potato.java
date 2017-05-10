package com.patterns.visitor.food;

public class Potato implements Ingredient {

	@Override
	public void prepare(PreparationMethod method) {
		method.process(this);

	}

}
