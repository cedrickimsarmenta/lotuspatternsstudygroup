package com.patterns.observer.timezone;

public class Australia extends Country {
	
	private static final String AUS_TIMEZONE = "Australia/West";
	
	public Australia(UnitedNation unitedNation){
		this.unitedNation = unitedNation;
		this.unitedNation.addNewCountry(this);
	}
	
	@Override
	public void getTimeZone() {
		System.out.println("the time in AUSTRALIA is ");
	}

	@Override
	public String getTimeZoneName() {
		return AUS_TIMEZONE;
	}

}
