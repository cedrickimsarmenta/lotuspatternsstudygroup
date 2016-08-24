package com.patterns.command.tv;

public class VolumeUpCommand extends AbtractRemoteCommand {

	protected VolumeUpCommand(Television receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eggxecute() {
		this.getReceiver().setVolume(this.getReceiver().getVolume() + 1);
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
