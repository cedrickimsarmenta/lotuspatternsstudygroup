package com.patterns.observer.advertisement;

public class RadioStation extends ServiceProvider{
	
	public RadioStation(Advertiser advertiser) {
		this.advertiser = advertiser;
		this.advertiser.addServiceProvider(this);
	}

	@Override
	public void updateAdvertisement() {
		System.out.println("Advertising in Radio:" + advertiser.getCommerciaLine());
		
	}

}
