package com.patterns.ralph.chainresponsibility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryStore {
	
	private static  InventoryStore instance = new InventoryStore();
	Map<Long,Inventory> invetory = new HashMap<>();
	
	private InventoryStore(){
		for(ProductConstants prod : ProductConstants.values()){
			Inventory inventory = new Inventory();
			inventory.setProduct(new Product(prod.getId(),prod.getDescription(),prod.getPrice()));
			inventory.setQuantity(100);
			invetory.put(prod.getId(), inventory);
		}	
	}
	
	public static InventoryStore getInstance(){
		return instance;
	}
	
	public String minusInventory(List<Order> orders){
		synchronized (invetory) {
			
			for(Order order: orders){
				Inventory inventory = invetory.get(order.getProduct().getId());
				if(inventory!= null ){
					if(inventory.getQuantity() >= order.getQuantity()){
						inventory.setQuantity(inventory.getQuantity() - order.getQuantity());
					}else{
						System.out.println("Inventory has less quantity than what you ordered");
						return  "FAIL";
					}
				}else{
					System.out.println("Product not found in our inventory");
					return  "FAIL";
				}
			}
			return "SUCCESS";
		}
	}
	
	public int getRemainingQantity(Long productId){
		return invetory.get(productId).getQuantity();
	}

}
