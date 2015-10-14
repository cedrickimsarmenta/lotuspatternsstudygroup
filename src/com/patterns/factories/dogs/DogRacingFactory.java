package com.patterns.factories.dogs;

import java.util.Arrays;
import java.util.List;

public abstract class DogRacingFactory {
	public abstract  Object getRaces();
	public abstract Object getPrices();
	public abstract Object getResults();
	public abstract String getCountry();
	
	private static final List<DogRacingFactory> FACTORIES = Arrays.asList(new SISFactory(), new IrishDogsFactory()); 
	
	public static DogRacingFactory getByCountry(String country) {

		for (DogRacingFactory factory : FACTORIES) {
			if(factory.getCountry().equals(country)) {
				return factory;
			}
		}
			
		throw new IllegalArgumentException(country);
	}
}
