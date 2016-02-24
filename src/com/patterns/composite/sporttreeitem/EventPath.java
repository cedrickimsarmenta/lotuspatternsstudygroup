package com.patterns.composite.sporttreeitem;

import java.util.ArrayList;
import java.util.List;

public class EventPath extends AbstractSportsItem{
	
	  public EventPath(String namme) {
		super(namme);
		// TODO Auto-generated constructor stub
	}

	List<SportsTreeItem> sportsTreeItems = new ArrayList<>();

	@Override
	public void printItems() {
		System.out.println("|EP|"+this.namme);
		for (SportsTreeItem sportsTreeItem :  getChildren()) {
			sportsTreeItem.printItems();
		}
		
		
	}

	public List<SportsTreeItem> getChildren() {
		return sportsTreeItems;
	}

	public void add(SportsTreeItem soSportsTreeItem) {
		// TODO Auto-generated method stub
		sportsTreeItems.add(soSportsTreeItem);
	}

	public void remove(SportsTreeItem soSportsTreeItem) {
		sportsTreeItems.remove(soSportsTreeItem);		
	}
	  
}
