package com.patterns.visitor.kerby;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
	public static void main(String[] args) {
		 List<Visitable> items = new ArrayList<Visitable>();
		 items.add(new Cake());
		 items.add(new Tea());
		 items.add(new Coffee());
		 CakeLoverVisitor cakeLoverVisitor = new CakeLoverVisitor();
		 for(Visitable item: items) {
		      item.accept(cakeLoverVisitor);
		 }
		 CoffeeLoverVisitor coffeeLoverVisitor = new CoffeeLoverVisitor();
		 for(Visitable item: items) {
		      item.accept(coffeeLoverVisitor);
		 }
		 TeaLoverVisitor teaLoverVisitor = new TeaLoverVisitor();
		 for(Visitable item: items) {
		      item.accept(teaLoverVisitor);
		 }
		
	}

}
