package com.patterns.chainofresponsibility.kerby;

public interface CoffeMaker {
	public void processCoffee(CupOfCoffee cupOfCoffee) throws Exception;
	public void setNextChain(CoffeMaker coffee);
}
