package com.patterns.concurrency;

import java.io.IOException;

public class ContentGatherer implements Runnable{

	@Override
	public void run() {
		while(true){
			Store store = Store.getInstance();
			try {
				store.getDataFromFile();
				System.out.println(store.getStoreContents());
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
