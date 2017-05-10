package com.patterns.visitor.troy;

public class LetterB implements Letter {

	@Override
	public String getValue() {
		return "b";
	}

	@Override
	public String accept(Formater formater) {
		return formater.format(this);
	}
	
	

}
