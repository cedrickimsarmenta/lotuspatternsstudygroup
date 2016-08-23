package com.patterns.command.cedric;

import java.util.HashMap;
import java.util.Map;


public class XDrawer extends AbstractDrawer {
	private static final String X_CHARACTER = "X";
	private int size;
	
	Map<String, String> prevVals = new HashMap<String, String>();
	
	public XDrawer(int xCoordinate, int yCoordinate, int size) {
		super(xCoordinate, yCoordinate);
		this.size = size;
	}

	@Override
	public void draw(Window window) {
		draw(this.getxCoordinate(), this.getyCoordinate(), window);
		for (int offset = 1; offset < size; offset ++) {
			draw(this.getxCoordinate()+offset, this.getyCoordinate()+offset, window);
			draw(this.getxCoordinate()-offset, this.getyCoordinate()-offset, window);
			draw(this.getxCoordinate()+offset, this.getyCoordinate()-offset, window);
			draw(this.getxCoordinate()-offset, this.getyCoordinate()+offset, window);
		}
	}
	private void draw(int x, int y, Window window) {
		storePrevVal(x, y, window.getPixel(x, y));
		window.draw(x, y, X_CHARACTER);
				
	}
	
	private void storePrevVal(int x, int y, String prevVal) {
		prevVals.put(x + "-" + y, prevVal);
	}
	@Override
	public void undo(Window window) {
		for(String coordinate : prevVals.keySet()) {
			String[] coordinateList = coordinate.split("-");
			int x = Integer.parseInt(coordinateList[0]);
			int y = Integer.parseInt(coordinateList[1]);
			window.draw(x, y, prevVals.get(coordinate));
		}
		
	}

	@Override
	public String toString() {
		return "XDrawer [size=" + size + ", getxCoordinate()=" + getxCoordinate() + ", getyCoordinate()="
				+ getyCoordinate() + "]";
	}

}
