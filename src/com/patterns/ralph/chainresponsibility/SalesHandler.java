package com.patterns.ralph.chainresponsibility;

import java.util.List;

public abstract class SalesHandler {
	
	private SalesHandler nextChain;

	protected abstract String hanlde(List<Order> orders);
	
	public void execute(List<Order> orders){
		String response  = hanlde(orders);
		if(response.equals("SUCCESS") && null!=nextChain){
			nextChain.execute(orders);
		}
		
	}
	
	public void setNextChain(SalesHandler nextChain){
		if(this.nextChain == null){
			this.nextChain =  nextChain;
		}else{
			this.nextChain.setNextChain(nextChain);
		}
	}
}
