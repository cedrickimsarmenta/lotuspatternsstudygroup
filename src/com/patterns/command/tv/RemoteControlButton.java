package com.patterns.command.tv;

public class RemoteControlButton {
	private String label;
	private RemoteCOmmand command;
	
	protected RemoteControlButton(String label, RemoteCOmmand command) {
		super();
		this.label = label;
		this.command = command;
	}


	public void pressMe() {
		System.out.println("I was clicked: "+ label);
		if(!command.hasExecuted()) {
			command.eggxecute();	
		} else {
			command.undo();
		}
	}


	protected String getLabel() {
		return label;
	}


	protected RemoteCOmmand getCommand() {
		return command;
	}
	
	
}


