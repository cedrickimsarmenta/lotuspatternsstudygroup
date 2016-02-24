package com.patterns.observer.timezone;

public class Japan extends Country {
	
	private static final String JAP_TIMEZONE = "Japan";
	
	public Japan(UnitedNation unitedNation){
		this.unitedNation = unitedNation;
		this.unitedNation.addNewCountry(this);
	}
	
	@Override
	public void getTimeZone() {
		System.out.println("the time in JAPAN is ");
	}

	@Override
	public String getTimeZoneName() {
		return JAP_TIMEZONE;
	}

}
