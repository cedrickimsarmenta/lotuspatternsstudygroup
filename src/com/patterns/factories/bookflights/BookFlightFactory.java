package com.patterns.factories.bookflights;

import java.util.List;

public abstract class BookFlightFactory {
	public abstract String getHotline();
	public abstract List<String> getFlights();
	public abstract String getTicketTemplate();
}
