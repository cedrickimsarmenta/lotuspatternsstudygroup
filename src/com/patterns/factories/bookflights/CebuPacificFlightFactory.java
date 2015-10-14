package com.patterns.factories.bookflights;

import java.util.Arrays;
import java.util.List;

public class CebuPacificFlightFactory extends BookFlightFactory {

	@Override
	public String getHotline() {
		// TODO Auto-generated method stub
		return "4228665";
	}

	@Override
	public List<String> getFlights() {
		List<String> schedules = Arrays.asList("cp123", "cp122", "cp124");
		return schedules;
	}

	@Override
	public String getTicketTemplate() {
		String ticketTemplate = "Thank you for booking CebuPacific.";
		return ticketTemplate;
	}


}
