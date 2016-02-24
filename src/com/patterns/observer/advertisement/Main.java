package com.patterns.observer.advertisement;

public class Main {

	public static void main(String[] args) {
		Advertiser advertiser = new Advertiser();
		new Television(advertiser);
		new RadioStation(advertiser);
		
		advertiser.setCommerciaLine("Dont vote for Binay");
		advertiser.setCommerciaLine("Dont vote for Roxas");
		advertiser.setCommerciaLine("Vote for Duterte");

	}

}
