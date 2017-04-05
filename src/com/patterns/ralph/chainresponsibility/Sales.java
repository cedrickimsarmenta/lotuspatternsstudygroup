package com.patterns.ralph.chainresponsibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sales {
	SalesHandler salesHandler;
	public Sales(){
		salesHandler = new InventoryHandler();
		salesHandler.setNextChain(new ReceiptHandler());
		salesHandler.setNextChain(new NotifHandler());
	}
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		Sales sales = new Sales();
		
			List<Order> orders = new ArrayList<>();
			int x = 1;
			while(x == 1){
				
					System.out.println("Select product and quantity to order");
					
					System.out.println("Product id , Product Name,  Price");
					for(ProductConstants product : ProductConstants.values()){	
						System.out.println(product.getId()+"   "+product.getDescription()+"     "+product.getPrice());
					}
					System.out.println("Enter product id (space) quantity");
					List<String> inputs = Arrays.asList(input.nextLine().split(" "));
					if(inputs.size()==2 && inputValid(inputs)){
						Order order = new Order();
						ProductConstants product = ProductConstants.getProductById(Long.parseLong(inputs.get(0)));
						order.setProduct(new Product(product.getId(), product.getDescription(), product.getPrice()));
						order.setQuantity(Integer.parseInt(inputs.get(1)));
						orders.add(order);
						System.out.println("Want to add more products? 1 for yes any key for no");
						if(!input.nextLine().equals("1")){
							x = 0;
						}
					}else{
						System.out.println("ERROR input want to try again? 1 for yes any key for no");
						if(!input.nextLine().equals("1")){
							x = 0;
						}
						
					}
		
				
			
			
			
			// process the request
			sales.salesHandler.execute(orders);
		}
	}

	private static boolean inputValid(List<String> inputs) {
		boolean valid =false;
		
		try{
			if(null!=ProductConstants.getProductById(Long.parseLong(inputs.get(0)))){
				valid = true;
			}
			Integer.parseInt(inputs.get(1));
		}catch(Exception e ){
			valid = false;
		}
		return valid;
	}
}
