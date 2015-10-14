package com.patterns.factories.bookflights;

import java.util.Arrays;
import java.util.List;

public class AirAsiaFlightFactory extends BookFlightFactory {

	@Override
	public String getHotline() {
		// TODO Auto-generated method stub
		return "9116001";
	}

	@Override
	public List<String> getFlights() {
		List<String> schedules = Arrays.asList("aa123", "aa122", "aa124");
		return schedules;
	}

	@Override
	public String getTicketTemplate() {
		String ticketTemplate = "Thank you for booking AirAsia.";
		return ticketTemplate;
	}


}
