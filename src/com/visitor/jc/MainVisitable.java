package com.visitor.jc;

import java.util.ArrayList;
import java.util.List;

public class MainVisitable {

	public static void main(String args[]){
		
		List<Visitable> visitables = new ArrayList<Visitable>();
		Necessity necessity =  new Necessity(2.1);
		Liquor liquor = new Liquor(3.1);
		
		visitables.add(necessity);
		visitables.add(liquor);
		TaxVisitor taxVisitor = new TaxVisitor();
		
		for (Visitable visitable : visitables) {
			System.out.println(visitable.accept(taxVisitor));
		}
		
	}
}
