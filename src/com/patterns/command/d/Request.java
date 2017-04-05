package com.patterns.command.d;

public class Request {
	

	public int priorityLevel;
	
	public Request(int priorityLevel){
		this.priorityLevel = priorityLevel;
	}

	public static void main(String[] args) {
		Request r = new Request(5);
		Processor staff = new Processor(1);
		Processor supervisor = new Processor(2);
		Processor juniorManager = new Processor(3);
		Processor midManager = new Processor(4);
		Processor seniorManager = new Processor(5);
		staff.setNextProcessor(supervisor);
		supervisor.setNextProcessor(juniorManager);
		juniorManager.setNextProcessor(midManager);
		midManager.setNextProcessor(seniorManager);
		
		staff.processRequest(r);
	}

}
