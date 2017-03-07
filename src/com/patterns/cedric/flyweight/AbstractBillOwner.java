package com.patterns.cedric.flyweight;


public abstract class AbstractBillOwner implements BillOwner {
	
	private String name;
	
	protected AbstractBillOwner(String name) {
		super();
		this.name = name;
	}
	@Override
	public void printBills() {
		System.out.println("Bills for " + getName());
		Integer total = 0;
		for(Bill bill: getBills()) {
			System.out.println("Bill: " + bill);
			total += bill.getAmount();
		}
		
		System.out.println("Total: " + total);
	}
	public String getName() {
		return name;
	}
	
	
}
