package com.patterns.cedric.flyweight;

public class Bill {
	private String currencyCode;
	private Integer amount;
	@Override
	public String toString() {
		return "Bill [currencyCode=" + currencyCode + ", amount=" + amount + "]";
	}
	protected Bill(String currencyCode, int amount) {
		super();
		this.currencyCode = currencyCode;
		this.amount = amount;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public Integer getAmount() {
		return amount;
	}
	
}
