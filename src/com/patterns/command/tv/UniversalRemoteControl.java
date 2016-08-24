package com.patterns.command.tv;

import java.util.HashMap;
import java.util.Map;

public class UniversalRemoteControl {
	
	private Map<String, RemoteControlButton> buttons = new HashMap<String, RemoteControlButton>();
	public void init(Television tv) {
		RemoteCOmmand volumeCommand = new VolumeUpCommand(tv);
		RemoteControlButton volumeUpButton = new RemoteControlButton("..--||", volumeCommand);
		buttons.put(volumeUpButton.getLabel(), volumeUpButton);
		RemoteCOmmand ch = new ChannelUpCommand(tv);
		RemoteControlButton channelUpButton = new RemoteControlButton("+", ch);
		buttons.put(channelUpButton.getLabel(), channelUpButton);

		RemoteCOmmand muteCommand = new MuteCommand(tv);
		RemoteControlButton muteButton = new RemoteControlButton("</()", muteCommand);
		buttons.put(muteButton.getLabel(), muteButton);
		RemoteCOmmand channelSetCommand = new ChannelSetCommand(tv, 7);
		RemoteControlButton channelSetButton = new RemoteControlButton("7", channelSetCommand);
		buttons.put(channelSetButton.getLabel(), channelSetButton);

	}
	
	public void pindot(String label) {
		if(buttons.containsKey(label)) {
			buttons.get(label).pressMe();
		} else {
			System.out.println("LOL");
		}
	}
}
