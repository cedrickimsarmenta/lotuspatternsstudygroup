package com.concurrency.cedric;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class BankExecutorServiceImpl extends ThreadPoolExecutor implements BankExecutorService {
	  
	public BankExecutorServiceImpl(int corePoolSize, int maximumPoolSize,
              long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
      super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
      
      //Queue for handicaps and non handicaps
      bankTransactionQueues.put(true, new LinkedList<BankTransaction>());
      bankTransactionQueues.put(false, new LinkedList<BankTransaction>());
      
	}
	 
	private final Map<Boolean, Queue<BankTransaction>> bankTransactionQueues = new HashMap<Boolean, Queue<BankTransaction>>();
	
	
	@Override
	public void execute(Runnable task, boolean handicappedYN) {
		boolean first;
		BankTransaction bankTransaction;
		synchronized (bankTransactionQueues) {
			Queue<BankTransaction> appliableQueue = bankTransactionQueues.get(handicappedYN);
			bankTransaction = new BankTransaction(task, handicappedYN);
			appliableQueue.offer(bankTransaction);
			
			first = appliableQueue.size() == 1;
		}

		// execute method can block, call it outside synchronize block
		if (first)
			execute(bankTransaction);		
	}
	
	private class BankTransaction implements Runnable {
		private Runnable wrappedBankTransaction;
		private Boolean handicappedYN;

		protected BankTransaction(Runnable wrappedBankTransaction, Boolean handicappedYN) {
			super();
			this.wrappedBankTransaction = wrappedBankTransaction;
			this.handicappedYN = handicappedYN;
		}


		@Override
		public void run() {
			try {
				wrappedBankTransaction.run();
			} finally {
				Queue<BankTransaction> applicableQueue = bankTransactionQueues.get(handicappedYN);
				
				BankTransaction nextTask = null;
				synchronized (bankTransactionQueues) {
					applicableQueue.remove(this);
					if (!applicableQueue.isEmpty()) {
						nextTask = applicableQueue.poll();
					}
				}
				if(nextTask != null) {
					execute(nextTask);
				}
			}			
		}
		
	}
}
