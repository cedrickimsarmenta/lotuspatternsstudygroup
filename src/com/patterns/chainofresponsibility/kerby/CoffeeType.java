package com.patterns.chainofresponsibility.kerby;

public enum CoffeeType {
	BARAKO(100,1, 0), MAKIYATO(100,2,50), ESPRESSO(30,3,0), BARBELL(50,4,30);
	
	private int waterLevel;
	private int optionNumber;
	private int creamLevel;
	
	private CoffeeType(int waterLevel, int optioNumber, int creamLevel) {
		this.waterLevel = waterLevel;
		this.optionNumber = optioNumber;
		this.creamLevel = creamLevel;
	}
	
	public static CoffeeType getWaterLevelByType(int optionNumber) throws Exception{
		for(CoffeeType coffeeType: CoffeeType.values()){
			if(coffeeType.getOptionNumber() == optionNumber){
				return coffeeType;
			}
		}
		throw new Exception("CoffeeType unavailable.");
	}

	public int getWaterLevel() {
		return waterLevel;
	}


	public int getOptionNumber() {
		return optionNumber;
	}

	public int getCreamLevel() {
		return creamLevel;
	}
	
	

}
