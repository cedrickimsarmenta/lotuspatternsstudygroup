package com.patterns.chainofresponsibility.kerby;

import java.util.ArrayList;
import java.util.List;

public class CupOfCoffee {
	private int sugarLevel;
	private int coffeeOptionNum;
	private List<Object> ingredients;
	
	public CupOfCoffee(int sugarLevel, int coffeeOptionNum){
		this.coffeeOptionNum = coffeeOptionNum;
		this.sugarLevel = sugarLevel;
	}

	public int getSugarLevel() {
		return sugarLevel;
	}

	public void setSugarLevel(int sugarLevel) {
		this.sugarLevel = sugarLevel;
	}

	public List<Object> getIngredients() {
		return ingredients = new ArrayList<Object>();
	}

	public int getCoffeeOptionNum() {
		return coffeeOptionNum;
	}



	
	
	
}
