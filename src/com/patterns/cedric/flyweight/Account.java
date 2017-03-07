package com.patterns.cedric.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Account extends AbstractBillOwner{
	private String currency;

	public Account(String name, String currency) {
		super(name);
		this.currency = currency;
	}

	private List<Bill> bills = new ArrayList<>();
	@Override
	public List<Bill> getBills() {
		return bills;
	}

	@Override
	public void addBill(Bill bill) {
		bills.add(bill);
	}

	@Override
	public void addBills(List<Bill> bill) {
		bills.addAll(bill);
	}

	@Override
	public void rollbackTo(List<Bill> bills) {
		this.bills = bills;
	}
	public String getCurrency() {
		return currency;
	}

}
