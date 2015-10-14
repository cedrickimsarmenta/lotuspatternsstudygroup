package com.patterns.factories.books;

public class LordOfTheRings extends Book{

	@Override
	public String getAuthor() {
		
		return "JR something";
	}

	@Override
	public int getPages() {
		return 80;
	}

}
