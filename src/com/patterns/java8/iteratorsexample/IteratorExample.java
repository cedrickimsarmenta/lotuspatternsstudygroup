package com.patterns.java8.iteratorsexample;

import java.util.Arrays;
import java.util.List;

public class IteratorExample {
	
	public static void main(String[] args){
		List<Integer> numbers = Arrays.asList(1,2,3,5,6,4,7,8,9,10);
		
		
		System.out.println("Lambda");
		numbers.forEach(
				(value) -> System.out.print(value));

		System.out.println("\n\nMethod reference");
		numbers.forEach(System.out::print);

		System.out.println("\n\nStream");
		System.out.print(numbers.stream().map(e -> e * 2 ).reduce(0, (c,e) -> c + e));
		

		System.out.println("\n\nStream");
		System.out.print(numbers.stream()
				.filter(IteratorExample::isGreaterThan3)
				.filter(e -> e % 2 == 0)
				.map(e -> e)
				.findFirst().get());
		
	}
	
	public static Boolean isGreaterThan3(int n){
		return n > 3;
	}

}
