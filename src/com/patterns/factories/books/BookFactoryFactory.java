package com.patterns.factories.books;

public class BookFactoryFactory {

	public Book getByGenre(String genre){
		if(genre.equals("Drama")){
			return new FiftyShadesOfGrey();
		}else if(genre.equals("Fiction")){
			return new LordOfTheRings();
		}
		throw new RuntimeException("No factory for genre");
	}
}
