package com.patterns.composite.sporttreeitem;

public class Sport extends EventPath {

	public Sport(String namme) {
		super(namme);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printItems(){
		System.out.println("|(O)|"+this.namme);
		for (SportsTreeItem sportsTreeItem : sportsTreeItems) {
			
			sportsTreeItem.printItems();
			
		}
	}
}
