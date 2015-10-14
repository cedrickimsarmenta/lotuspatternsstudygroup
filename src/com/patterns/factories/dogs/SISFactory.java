package com.patterns.factories.dogs;

public class SISFactory extends DogRacingFactory{

	@Override
	public Object getRaces() {
		return "SIS race 1, SIS race 2";
	}

	@Override
	public Object getPrices() {
		return null;
	}

	@Override
	public Object getResults() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return "UK";
	}

}
