package com.patterns.concurrency.kerby;

public class CoffeeProvider extends Thread{
	public void run()
	   {
	      for (int i = 0; i < 5; i++)
	      {
	         System.out.println("Produced Coffee: " + i + " mg");
	         Thread.yield();
	      }
	   }
}
