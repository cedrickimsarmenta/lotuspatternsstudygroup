package com.concurrency.cedric;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		BlockingQueue<Runnable> queuePool = new ArrayBlockingQueue<>(2000);
		BankExecutorService bankExecutor = new BankExecutorServiceImpl(10, 20, 0L, TimeUnit.MILLISECONDS, queuePool);
		ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 20, 0L, TimeUnit.MILLISECONDS, queuePool);

		for(int i = 0 ; i < 100; i ++) {
			String normalName = "NormalPerson" + i;
			Person normalPerson = new Person(normalName, false);
			
			bankRun(bankExecutor, i, normalPerson);
//			normalRun(executor, i, normalPerson);
		}
	}

	private static void normalRun(ThreadPoolExecutor executor, int i, Person normalPerson) {
		executor.execute(new Runnable() {
			@Override
			public void run() {
				normalPerson.transact();					
			}
		});
		String handicapName = "HandicapPerson" + i;
		Person handicapPerson = new Person(handicapName, true);
		executor.execute(new Runnable() {
			@Override
			public void run() {
				handicapPerson.transact();					
			}
		});
	}

	private static void bankRun(BankExecutorService bankExecutor, int i, Person normalPerson) {
		bankExecutor.execute(new Runnable() {
			@Override
			public void run() {
				normalPerson.transact();					
			}
		}, false);
		String handicapName = "HandicapPerson" + i;
		Person handicapPerson = new Person(handicapName, true);
		bankExecutor.execute(new Runnable() {
			@Override
			public void run() {
				handicapPerson.transact();					
			}
		}, true);
	}
}
