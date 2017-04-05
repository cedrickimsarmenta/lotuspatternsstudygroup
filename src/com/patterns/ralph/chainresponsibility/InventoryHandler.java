package com.patterns.ralph.chainresponsibility;

import java.util.List;

public class InventoryHandler extends SalesHandler{
	

	@Override
	public String hanlde(List<Order> orders) {
		InventoryStore store = InventoryStore.getInstance();
		return store.minusInventory(orders);
		
	}


}
