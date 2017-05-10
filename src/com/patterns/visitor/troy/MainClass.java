package com.patterns.visitor.troy;

import java.util.Arrays;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		
		List<Letter> str = Arrays.asList(new LetterA(), new LetterB());
		
		// print original
		for (Letter letter : str) {
			System.out.print(letter.getValue());
		}
		
		System.out.println("\n-----------------");
		
		//apply bold
		for (Letter letter : str) {
			System.out.print(letter.accept(new BoldFormatter()));
		}
		
		System.out.println("\n-----------------");
		
		//apply italic
		for (Letter letter : str) {
			System.out.print(letter.accept(new ItallicFormatter()));
		}
		
	}
	
	private static void print() {
		
	}

}
