package com.patterns.cedric.flyweight;

import java.security.acl.Owner;

public class Bill implements BillFlyweight {
	private Owner owner;
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
	public void assign(BillOwner originalOwner, BillOwner newOwner) {
		newOwner.addBill(this);
	}
	
}
