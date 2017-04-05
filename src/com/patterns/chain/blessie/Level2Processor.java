package com.patterns.chain.blessie;

public class Level2Processor extends RequestProcessor {
	
	private RequestProcessor nextProcessor;

	@Override
	public void passToNextProcessor(Request r) {
		nextProcessor.processRequest(r);
	}

	@Override
	public boolean canDo(RequestLevel level) {
		return level.ordinal() <= 2;
	}

	@Override
	public void performAction(Request r) {
		System.out.println(r.getName() + " processed at Level 2");
	}

	@Override
	public void setNextProcessor(RequestProcessor p) {
		this.nextProcessor = p;
	}

}
