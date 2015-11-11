package com.patters.strategy.taxi;

public class StrategyTaxi {

	public static void main(String[]args){
		Taxi taxi = new Taxi((float)5.6);
		taxi.printBill();
	}
}
