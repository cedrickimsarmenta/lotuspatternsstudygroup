package com.patterns.concurrency;

import java.io.IOException;

public class Main {

	public static void main(String[]args) throws IOException, InterruptedException{
		Thread t = new Thread(new ContentGatherer());
		System.out.println("starting :" +t.getName());
		t.start();
		Thread.sleep(3000);
		Thread t2 = new Thread(new ContentGatherer());
		System.out.println("starting :" +t2.getName());
		t2.start();
		Thread t3 = new Thread(new ContentWriter());
		System.out.println("starting :" +t3.getName());
		t3.start();
		Thread t4 = new Thread(new ContentWriter());
		System.out.println("starting :" +t4.getName());
		t4.start();
	}
}
