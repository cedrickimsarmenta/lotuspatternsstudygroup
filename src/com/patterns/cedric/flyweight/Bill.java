package com.patterns.cedric.flyweight;


public class Bill implements BillFlyweight {
	private String currencyCode;
	private Integer amount;
	@Override
	public String toString() {
		return "Bill [currencyCode=" + currencyCode + ", amount=" + amount + "]";
	}
	public Bill(String currencyCode, int amount) {
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
	
	@Override
	public void transfer(BillOwner originalOwner, BillOwner newOwner) {
		newOwner.addBill(this);
		originalOwner.removeBill(this);
	}
	
}
