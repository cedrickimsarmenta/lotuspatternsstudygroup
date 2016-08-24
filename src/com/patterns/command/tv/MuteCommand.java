package com.patterns.command.tv;

public class MuteCommand extends AbtractRemoteCommand{
	private int previousVolume;
	
	protected MuteCommand(Television receiver) {
		super(receiver);
	}

	@Override
	public void eggxecute() {
//		if(isMuted) {
//			this.getReceiver().setVolume(previousVolume);
//			isMuted = false;
//		} else {
			this.previousVolume = this.getReceiver().getVolume();
			this.getReceiver().setVolume(0);
			hasExecuted = true;
//		}
	}

	@Override
	public void undo() {
		this.getReceiver().setVolume(this.previousVolume);
		hasExecuted = false;
	}



}
