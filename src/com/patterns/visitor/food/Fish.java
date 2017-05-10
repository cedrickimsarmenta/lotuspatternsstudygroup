package com.patterns.visitor.food;

public class Fish implements Ingredient {

	@Override
	public void prepare(PreparationMethod method) {
		method.process(this);
	}

}
