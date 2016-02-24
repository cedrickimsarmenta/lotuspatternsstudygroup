package com.patterns.observer.timezone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnitedNation {
	private List<Country> countries = new ArrayList<Country>();
	private Date date;
	
	
	public Date getDate() {
		return date;
	}
	public void setTime(Date date) {
		this.date = date;
		alertAllCountryMembers();
	}
	
	public void addNewCountry(Country newCountry){
		countries.add(newCountry);
	}
	
	public void alertAllCountryMembers(){
	      for (Country country : countries) {
	    	  country.getTimeZone();
	      }
	   } 
}
