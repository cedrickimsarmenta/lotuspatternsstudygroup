package com.patterns.observer.advertisement;

public class Television extends ServiceProvider {

	public Television(Advertiser advertiser) {
		this.advertiser = advertiser;
		this.advertiser.addServiceProvider(this);
	}

	@Override
	public void updateAdvertisement() {
		System.out.println("Advertising in TV:" + advertiser.getCommerciaLine());
		
	}

}
