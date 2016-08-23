package com.patterns.command.cedric;

public class DotDrawer extends AbstractDrawer {
	private static final String DOT_CHARACTER ="*";
	private String prevVal = null;
	public DotDrawer(int xCoordinate, int yCoordinate) {
		super(xCoordinate, yCoordinate);
	}

	@Override
	public void draw(Window window) {
		prevVal = window.getPixel(getxCoordinate(), getyCoordinate());
		window.draw(getxCoordinate(), getyCoordinate(), DOT_CHARACTER);
	}

	@Override
	public void undo(Window window) {
		window.draw(getxCoordinate(), getyCoordinate(), prevVal);
	}

	@Override
	public String toString() {
		return "DotDrawer [getxCoordinate()=" + getxCoordinate() + ", getyCoordinate()=" + getyCoordinate() + "]";
	}
}
