package com.patterns.cedric.flyweight;

import java.util.List;

public interface BillOwner {
	public String getName();
	public List<Bill> getBills();
	public void rollbackTo(List<Bill> bills);
	
	public void addBill(Bill bill);
	public void addBills(List<Bill> bill);
	public void printBills();
}
