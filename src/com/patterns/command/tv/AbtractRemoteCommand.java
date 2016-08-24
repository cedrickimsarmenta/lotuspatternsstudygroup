package com.patterns.command.tv;

public abstract class AbtractRemoteCommand implements RemoteCOmmand {
	private Television receiver;
	protected boolean hasExecuted;
	@Override
	public boolean hasExecuted() {
		return hasExecuted;
	}
	
	protected AbtractRemoteCommand(Television receiver) {
		super();
		this.receiver = receiver;
	}



	protected Television getReceiver() {
		return receiver;
	}
	
	
}
