package com.patterns.template.airline;

import java.util.Scanner;

public class CebuPacAirTicketBooking extends AirTicketBooking {

	@Override
	void loginToWebsite() {
		System.out.println("Welcome to www.cebupac.com");

	}


	@Override
	void loadDestination() {
		destinations.add("1. Iloilo/Manila/12-23-2015/100");
		destinations.add("2. Cebu/Manila/12-23-2015/200");
		destinations.add("3. Bohol/Manila/12-23-2015/300");
		destinations.add("4. China/Manila/12-23-2015/1000");
		destinations.add("5. Java/Manila/12-23-2015/2000");
		
	}

	
}
