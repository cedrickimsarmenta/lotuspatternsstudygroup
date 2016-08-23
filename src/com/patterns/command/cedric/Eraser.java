package com.patterns.command.cedric;

public class Eraser extends AbstractDrawer {
	private static final String BLANK_CHARACTER = " ";

	protected Eraser(int xCoordinate, int yCoordinate) {
		super(xCoordinate, yCoordinate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Window window) {
		drawPixel(getxCoordinate(), getyCoordinate(), window, BLANK_CHARACTER);
	}
}
