package com.patterns.concurrency;

import java.io.IOException;
import java.util.UUID;

public class ContentWriter implements Runnable{

	@Override
	public void run() {
		
		while(true){
			Store store = Store.getInstance();
			try {
				store.writeDataToFile(createRandomValue());
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		
	}
	
	private String createRandomValue(){
		String uuid = UUID.randomUUID().toString();
		return  uuid.substring(0, 6)+"\n";
	}

	
}
