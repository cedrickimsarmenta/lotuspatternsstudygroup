package com.patterns.composite.sporttreeitem;

import java.util.ArrayList;
import java.util.List;

public class Event extends AbstractSportsItem{

	public Event(String namme) {
		super(namme);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printItems() {
		System.out.println("|GE|" + this.namme);
	}




	
}
