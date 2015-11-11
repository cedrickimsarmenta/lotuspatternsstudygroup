package com.patters.strategy.taxi;

public interface BillingStrategy {
	public double getActPrice(double rawPrice);
}
