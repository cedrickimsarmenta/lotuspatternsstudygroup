package com.patterns.concurrency.kerby;

public class CreamProvider extends Thread{
	 public void run()
	   {
	      for (int i = 0; i < 5; i++)
	      {
	         System.out.println("Produced Cream: " + i + " mg");
	         Thread.yield();
	      }
	   }
}
