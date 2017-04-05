package com.patterns.chain.blessie;

public class DoNothingProcessor extends RequestProcessor {
	
	@Override
	public void passToNextProcessor(Request r) {
		// end of the line
	}

	@Override
	public boolean canDo(RequestLevel level) {
		return true;
	}

	@Override
	public void performAction(Request r) {
		System.out.println("Nothing to do here for "+r.getName());
	}

	@Override
	public void setNextProcessor(RequestProcessor p) {
		// nothing to do here
	}

}
