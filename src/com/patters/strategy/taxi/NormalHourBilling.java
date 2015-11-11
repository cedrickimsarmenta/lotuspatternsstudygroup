package com.patters.strategy.taxi;

public class NormalHourBilling implements BillingStrategy{

	@Override
	public double getActPrice(double rawPrice) {
		return rawPrice;
	}

}
