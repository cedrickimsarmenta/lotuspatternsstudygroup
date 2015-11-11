package com.patters.strategy.taxi;

public class PickHourBilling implements BillingStrategy{

	@Override
	public double getActPrice(double rawPrice) {
		return rawPrice * 2;
	}

}
