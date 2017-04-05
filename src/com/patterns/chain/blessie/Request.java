package com.patterns.chain.blessie;

public class Request {
	
	private RequestLevel level;
	private String name;
	
	public Request() {
	}
	
	public Request(String name, RequestLevel level) {
		this.name = name;
		this.level = level;
	}
	
	public RequestLevel getLevel() {
		return level;
	}
	public void setLevel(RequestLevel level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
