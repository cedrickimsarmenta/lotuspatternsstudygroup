package com.patterns.template.performer;

public class Concert {
	public static void main(String[] args) {
		Dancer neil = new Dancer("Neil");
		Guitarist sungha = new Guitarist("Sungha");
		
		neil.perform();
		
		sungha.perform();
	}
}
