package com.patterns.template.cargodelivery;

public class LandCargoDelivery extends CargoDelivery{
	@Override
	protected void transport(){
		System.out.println("Delivering cargo through the impassable road.");
	}
	
	@Override
	protected String getVehicleType(){
		return "Truck";
	}

}