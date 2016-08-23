package com.patterns.command.cedric;

public abstract class AbstractDrawer implements DrawCommand{
	private int xCoordinate;
	private int yCoordinate;
	protected AbstractDrawer(int xCoordinate, int yCoordinate) {
		super();
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	protected int getxCoordinate() {
		return xCoordinate;
	}
	protected int getyCoordinate() {
		return yCoordinate;
	}
}
