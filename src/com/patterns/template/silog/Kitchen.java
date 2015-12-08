package com.patterns.template.silog;

public class Kitchen {

	public static void main(String[] args) {
		new Tapsilog().cook();
		new LongSilog().cook();
		new BaconSilog(true).cook();
		new BaconSilog(false).cook();
	}

}
