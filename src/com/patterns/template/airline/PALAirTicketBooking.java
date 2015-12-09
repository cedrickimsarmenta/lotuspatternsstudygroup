package com.patterns.template.airline;

public  class PALAirTicketBooking extends AirTicketBooking{

	@Override
	void loginToWebsite() {
		System.out.println("Welcome to www.pal.com");
		
	}



	@Override
	void loadDestination() {
		destinations.add("1. Manila/Iloilo/12-23-2015/100");
		destinations.add("2. Manila/Cebu/12-23-2015/200");
		destinations.add("3. Manila/Bohol/12-23-2015/300");
		destinations.add("4. Manila/China/12-23-2015/1000");
		destinations.add("5. Manila/Java/12-23-2015/2000");
	}

		

    
}
