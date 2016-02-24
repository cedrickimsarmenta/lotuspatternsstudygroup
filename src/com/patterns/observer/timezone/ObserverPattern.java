package com.patterns.observer.timezone;

import java.util.Date;

public class ObserverPattern {

	public static void main(String[] args) {
		  UnitedNation united = new UnitedNation();

	      new Australia(united);
	      new Japan(united);
	      new UnitedKingdom(united);
	     
	      
	      Date date = new Date();
	      
	      united.setTime(date);
	}

}
