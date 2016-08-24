package com.patterns.command.tv;

public class Television {
	private int volume;
	private int channel;
	
	
	public void display() {
		System.out.println("--------------------------------------------------");
		System.out.println("|                                                 |");
		System.out.println("|                                                 |");
		System.out.println("|                                                 |");
		System.out.println("|                                                 |");
		System.out.println("|                                                 |");
		System.out.println("|                                                 |");
		System.out.println("|                                                 |");
		System.out.println("|                                                 |");
		System.out.println("|" + "Volume: " + volume + " Channel: " + channel + "                         |"                                             );
		System.out.println("--------------------------------------------------");
		
	}
	
	protected Television(int volume, int channel) {
		super();
		this.volume = volume;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
}
