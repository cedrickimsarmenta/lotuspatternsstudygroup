package com.patterns.observer.timezone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public abstract class Country {
	protected UnitedNation unitedNation;

	public abstract void getTimeZone();
	public abstract String getTimeZoneName();

	protected Date setTimeZoneByDate(Date date) {
		Date dateWithTimezone = null;
		try {
			SimpleDateFormat isoFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
			isoFormat.setTimeZone(TimeZone.getTimeZone(getTimeZoneName()));
			dateWithTimezone = isoFormat.parse(date.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dateWithTimezone;
	}
}
