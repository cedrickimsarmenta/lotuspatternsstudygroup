package com.patterns.factories.bookflights;

public class BookFlightFactoryFactory {
	public BookFlightFactory getByCompany(String company){
		if(company.equals("CebuPacific")){
			return new CebuPacificFlightFactory();
		} else if(company.equals("AirAsia")){
			return new AirAsiaFlightFactory();
		}
	throw new IllegalArgumentException();
	}
}
