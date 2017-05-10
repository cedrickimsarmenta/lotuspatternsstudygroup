package com.patterns.visitor.food;

public interface PreparationMethod {
	void process(Ingredient ingredient);
	void process(Potato potato);
	void process(Chicken chicken);
	void process(Fish fish);
	void process(Egg egg);
}
