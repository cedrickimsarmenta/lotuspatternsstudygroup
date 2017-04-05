package com.patterns.chain.blessie;

public abstract class RequestProcessor {
	
	public void processRequest(Request r){
		if(canDo(r.getLevel())){
			performAction(r);
		} else {
			passToNextProcessor(r);
		}
	}
	
	public abstract void passToNextProcessor(Request r);

	public abstract boolean canDo(RequestLevel level);

	public abstract void performAction(Request r);
	
	public abstract void setNextProcessor(RequestProcessor p);

}
