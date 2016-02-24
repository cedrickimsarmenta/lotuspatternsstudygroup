package com.patterns.composite.sporttreeitem;

import java.util.List;

public interface SportsTreeItem {
	public void printItems();
	public List<SportsTreeItem> getChildren();
	public void add(SportsTreeItem soSportsTreeItem);
	public void remove(SportsTreeItem soSportsTreeItem);

	public String getName();
	
}
