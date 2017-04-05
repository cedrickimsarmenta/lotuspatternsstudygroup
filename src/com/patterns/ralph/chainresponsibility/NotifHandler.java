package com.patterns.ralph.chainresponsibility;

import java.util.List;

public class NotifHandler extends SalesHandler{

	@Override
	protected String hanlde(List<Order> orders) {
		for(Order order : orders){
			System.out.println(order.getProduct().getDescription()+" - inhouse remaining after purchase "+ 
					InventoryStore.getInstance().getRemainingQantity(order.getProduct().getId()));
		}
		return "SUCCESS";
	}

}
