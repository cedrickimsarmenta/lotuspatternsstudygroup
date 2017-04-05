package com.patterns.ralph.chainresponsibility;

import java.math.BigDecimal;
import java.util.List;

public class ReceiptHandler extends SalesHandler{

	@Override
	public String hanlde(List<Order> orders) {
		System.out.println("*************************************************");
		System.out.println("*               RALPH STORE                     *");
		System.out.println("*           123-123-321-321-321                 *");
		System.out.println("*************************************************");
		System.out.printf("%-1s%-16s%-16s%-15s%-1s\n","*","Name","Qantity","Total", "*");
		for(Order order: orders){
			Product product = order.getProduct();
			System.out.printf("%-1s%-16s%-16s%-15s%-1s\n","*",
					product.getDescription(),order.getQuantity(),
					product.getPrice().multiply(BigDecimal.valueOf(order.getQuantity())), "*");	
		}
		return "SUCCESS";
		
		
	}

}
