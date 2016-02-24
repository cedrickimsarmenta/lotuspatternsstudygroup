package com.patterns.observer.taxi;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
	
    List<Observer> observers = new ArrayList<Observer>();
    TaxiMeter taxiMeter = new TaxiMeter();
    int distanceToTravel = 5;
    
    public  Taxi(){
    	observers.add(taxiMeter);
    }
	
    public void start(){
    	for(Observer observer: observers){
    		observer.onStart();
    	}
    }
    
    
    public static void main(String[]args){
    	Taxi taxi = new Taxi();
    	taxi.start();
    	try{
    		while(true){
        		taxi.addDistance();
        		Thread.sleep(5000);
        	}
    	}catch(Exception e){
    		taxi.stop();
    	}
    }

	private void stop() {
		for(Observer observer: observers){
    		observer.onStop();
    	}
		
	}

	private void addDistance() throws Exception {
		for(Observer observer: observers){
    		observer.onUpdate();
    	}
		if(taxiMeter.getDistanceTravelled()==distanceToTravel){
			throw new Exception("Destination arrived");
		}
	}
    
}
