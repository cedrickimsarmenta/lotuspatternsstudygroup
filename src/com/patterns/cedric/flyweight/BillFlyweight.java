package com.patterns.cedric.flyweight;

public interface BillFlyweight {
	public void transfer(BillOwner originalOwner, BillOwner newOwner);
}
