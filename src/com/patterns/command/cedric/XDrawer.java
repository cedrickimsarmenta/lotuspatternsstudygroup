package com.patterns.command.cedric;

import java.util.HashMap;
import java.util.Map;


public class XDrawer extends AbstractDrawer {
	private static final String X_CHARACTER = "X";
	private int size;
	
	public XDrawer(int xCoordinate, int yCoordinate, int size) {
		super(xCoordinate, yCoordinate);
		this.size = size;
	}

	@Override
	public void draw(Window window) {
		drawPixel(this.getxCoordinate(), this.getyCoordinate(), window, X_CHARACTER);
		for (int offset = 1; offset < size; offset ++) {
			drawPixel(this.getxCoordinate()+offset, this.getyCoordinate()+offset, window, X_CHARACTER);
			drawPixel(this.getxCoordinate()-offset, this.getyCoordinate()-offset, window, X_CHARACTER);
			drawPixel(this.getxCoordinate()+offset, this.getyCoordinate()-offset, window, X_CHARACTER);
			drawPixel(this.getxCoordinate()-offset, this.getyCoordinate()+offset, window, X_CHARACTER);
		}
	}

	@Override
	public String toString() {
		return "XDrawer [size=" + size + ", getxCoordinate()=" + getxCoordinate() + ", getyCoordinate()="
				+ getyCoordinate() + "]";
	}

}
