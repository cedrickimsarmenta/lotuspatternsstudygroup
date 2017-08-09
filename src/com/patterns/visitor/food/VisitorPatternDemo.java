package com.patterns.visitor.food;

public class VisitorPatternDemo {

	public static void main(String[] args) {
		PreparationMethod method = new Blending();
		
		Ingredient potato = new Potato();
		Chicken chicken = new Chicken();
		Fish fish = new Fish();
		Egg egg = new Egg();
		method.process(potato);
		potato.prepare(method);
		chicken.prepare(method);
		fish.prepare(method);
		egg.prepare(method);
	}

}
