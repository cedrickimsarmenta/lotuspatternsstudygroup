package com.patterns.factories.bookflights;

public class FlightOperator {
	public static void main(String[] args) {
		new FlightOperator().bookFLight("Ernest");
	}

	public void bookFLight(String company){
		BookFlightFactory bookFlightFactory = new BookFlightFactoryFactory()
.getByCompany(company);	
		System.out.println("Caaling" + bookFlightFactory.getHotline());
		System.out.println("Please select flight from the ff:" + bookFlightFactory.getFlights());
		System.out.println(bookFlightFactory.getTicketTemplate());
}
}
