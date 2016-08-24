package com.patterns.command.tv;

public class ChannelUpCommand extends AbtractRemoteCommand{

	protected ChannelUpCommand(Television receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eggxecute() {
		this.getReceiver().setChannel(this.getReceiver().getChannel() + 1);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasExecuted() {
		// TODO Auto-generated method stub
		return false;
	}

}
