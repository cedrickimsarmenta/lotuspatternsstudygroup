package com.patterns.command.tv;

public class ChannelSetCommand extends AbtractRemoteCommand {
	private int previousChannel;
	private int newChannel;
	
	protected ChannelSetCommand(Television receiver, int newChannel) {
		super(receiver);
		this.newChannel = newChannel;
	}

	@Override
	public void eggxecute() {
		previousChannel = this.getReceiver().getChannel();
		this.getReceiver().setChannel(newChannel);
		hasExecuted = true;
	}

	@Override
	public void undo() {
		this.getReceiver().setChannel(previousChannel);
		hasExecuted = false;
	}


}
