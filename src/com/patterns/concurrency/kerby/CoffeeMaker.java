package com.patterns.concurrency.kerby;

public class CoffeeMaker {
	 public static void main(String[] args)
	   {
	      Thread creamProvider = new CreamProvider();
	      Thread coffeeProvider = new CoffeeProvider();
	       
	      creamProvider.setPriority(Thread.MIN_PRIORITY);
	      coffeeProvider.setPriority(Thread.MAX_PRIORITY);
	       
	      creamProvider.start();
	      coffeeProvider.start();
	   }
}
