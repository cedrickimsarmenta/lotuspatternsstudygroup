package com.patterns.observer.timezone;

import java.util.Date;

public class UnitedKingdom extends Country {
	
	private static final String UK_TIMEZONE = "Europe/London";
	
	public UnitedKingdom(UnitedNation unitedNation){
		this.unitedNation = unitedNation;
		this.unitedNation.addNewCountry(this);
	}
	
	@Override
	public void getTimeZone() {
		Date theDate = setTimeZoneByDate(unitedNation.getDate());
		System.out.println("the time in UK is "+theDate);
	}

	@Override
	public String getTimeZoneName() {
		return UK_TIMEZONE;
	}

	

}
