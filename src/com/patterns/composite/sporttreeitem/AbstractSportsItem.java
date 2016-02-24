package com.patterns.composite.sporttreeitem;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSportsItem implements SportsTreeItem{
	String namme;

	public AbstractSportsItem(String namme) {
		super();
		this.namme = namme;
	}
	public String getName() {
		return namme;
	}
	
	@Override
	public List<SportsTreeItem> getChildren() {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}

	@Override
	public void add(SportsTreeItem soSportsTreeItem) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(SportsTreeItem soSportsTreeItem) {
		throw new UnsupportedOperationException();
		
	}
}
