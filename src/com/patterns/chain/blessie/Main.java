package com.patterns.chain.blessie;

public class Main {
	
	public static void main(String[] args) {
		RequestProcessor pNothing = new DoNothingProcessor();		
		
		RequestProcessor p2 = new Level2Processor();
		p2.setNextProcessor(pNothing);
		
		RequestProcessor p1 = new Level1Processor();
		p1.setNextProcessor(p2);
		
		Request r0 = new Request("r0", RequestLevel.MORTAL);
		Request r1 = new Request("r1", RequestLevel.DEMIGOD);
		Request r2 = new Request("r2", RequestLevel.GOD);
		Request r3 = new Request("mr meeseeks", RequestLevel.MR_MEESEEKS);
		
		p1.processRequest(r0);
		p1.processRequest(r1);
		p1.processRequest(r2);
		p1.processRequest(r3);
		
	}

}
