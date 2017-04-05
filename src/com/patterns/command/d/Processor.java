package com.patterns.command.d;

public class Processor {
	
	Processor nextProcessor;
	int priorityHandled = 0;
	
	public Processor(int priorityHandled){
		this.priorityHandled = priorityHandled;
	}
	
	public void setNextProcessor(Processor processor){
		this.nextProcessor = processor;
	}
	
	public void processRequest(Request request){
		if (request.priorityLevel <= priorityHandled){
			System.out.println("Processing Request Level" + request.priorityLevel );
		}else{
			System.out.println("Can only handle request level: " + priorityHandled +". Escalating Request");
			nextProcessor.processRequest(request);
		}
			
	}
}
