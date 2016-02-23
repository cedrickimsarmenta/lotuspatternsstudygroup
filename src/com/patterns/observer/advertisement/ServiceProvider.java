package com.patterns.observer.advertisement;

public abstract class ServiceProvider {
	protected Advertiser advertiser;
	public abstract void updateAdvertisement();
}
