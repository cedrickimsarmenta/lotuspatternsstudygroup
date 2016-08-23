package com.patterns.command.cedric;

public class SquareDrawer extends AbstractDrawer {
	private static final String SQUARE_CHARACTER = "@";
	private int size;
	protected SquareDrawer(int xCoordinate, int yCoordinate, int size) {
		super(xCoordinate, yCoordinate);
		this.size = size;
	}

	@Override
	public void draw(Window window) {
		int radius = (size/2);
		
		if(radius == 0) {
			drawPixel(getxCoordinate(), getyCoordinate(), window, SQUARE_CHARACTER);
			return;
		}
		for (int i=getxCoordinate() - radius; i < getxCoordinate() + radius; i ++) {
			for (int j=getyCoordinate() - radius; j < getyCoordinate() + radius; j ++) {
				drawPixel(i, j, window, SQUARE_CHARACTER);
			}
		}
	}

	@Override
	public String toString() {
		return "SquareDrawer [size=" + size + ", getxCoordinate()=" + getxCoordinate() + ", getyCoordinate()="
				+ getyCoordinate() + "]";
	}
}
