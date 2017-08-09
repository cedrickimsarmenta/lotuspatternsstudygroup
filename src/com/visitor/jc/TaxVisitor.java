package com.visitor.jc;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {
	
	// This formats the item prices to 2 decimal places
	
	DecimalFormat df = new DecimalFormat("#.##");

	// This is created so that each item is sent to the
	// right version of visit() which is required by the
	// Visitor interface and defined below
	
	public TaxVisitor() {
		
	}
	
	// Calculates total price based on this being taxed
	// as a necessity item
		
	public double visit(Necessity necessityItem) {
		System.out.println("Necessity Item: Price with Tax");
		return Double.parseDouble(df.format(necessityItem.getPrice() * 2 ));
	}
	
	public double visit(Liquor liquor){
		System.out.println("Liquor Item: Price with Tax");
		return Double.parseDouble(df.format(liquor.getPrice() * .5));
	}

}
