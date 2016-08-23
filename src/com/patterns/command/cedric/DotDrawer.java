package com.patterns.command.cedric;

public class DotDrawer extends AbstractDrawer {
	private static final String DOT_CHARACTER ="*";
	public DotDrawer(int xCoordinate, int yCoordinate) {
		super(xCoordinate, yCoordinate);
	}

	@Override
	public void draw(Window window) {
		drawPixel(getxCoordinate(), getxCoordinate(), window, DOT_CHARACTER);
	}

	@Override
	public String toString() {
		return "DotDrawer [getxCoordinate()=" + getxCoordinate() + ", getyCoordinate()=" + getyCoordinate() + "]";
	}
}
