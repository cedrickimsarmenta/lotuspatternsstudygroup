package com.patterns.cedric.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BangkoCentral {
	
	public static Map<String, Bill> uniqueBills = new HashMap<>();
	public static Bill getBill(String currency, Integer amount) {
		String key = currency+amount;
		if(!uniqueBills.containsKey(key)) {
			uniqueBills.put(key, new Bill(currency, amount));
		} 
		
		return uniqueBills.get(key);
		
	}
}
