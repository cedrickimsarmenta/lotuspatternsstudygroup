package com.concurrency.cedric;

import java.util.concurrent.ExecutorService;

public interface BankExecutorService extends ExecutorService {
	/**
	 * Execute a task for a person.
	 * 
	 * Howeer, we need to respect queue numbers. There is one queue for disabled, and one queue
	 * for normal people
	 * 
	 * @param task
	 * @param actor
	 */
	public void execute(Runnable task, boolean handicappedYN);
}
