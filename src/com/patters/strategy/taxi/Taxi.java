package com.patters.strategy.taxi;

import java.util.Arrays;
import java.util.Calendar;

public class Taxi {
	
	public static int amPick[]= {7,8,9};
	public static int pmPick[]= {5,6,7};

	private float distance;
	private BillingStrategy billStrategy;
	
	public Taxi(float distance){
		  this.distance = distance;
		if(isPickHour()){
			billStrategy = new PickHourBilling();
		}else{
			billStrategy = new NormalHourBilling();
		}
	}
	
	public void printBill(){
		System.out.println(billStrategy.getActPrice(getPrice(distance)));
	}
	
	private float getPrice(float distance){
		if(distance<5){
			return (float) 40.00;
		}else{
			float flagDown = (float) ((distance - 4)*2.5);
			return (float) 40.00 + flagDown;
		}
		
	}
	
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	
	public boolean isPickHour() {
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR);
		if(c.get(Calendar.AM_PM)==Calendar.AM){
			return Arrays.asList(amPick).contains(hour);
		}else{
			return Arrays.asList(pmPick).contains(hour);
		}
		
	}

}
