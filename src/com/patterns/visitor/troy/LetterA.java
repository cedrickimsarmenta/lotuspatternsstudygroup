package com.patterns.visitor.troy;

public class LetterA implements Letter {

	@Override
	public String getValue() {
		return "a";
	}

	@Override
	public String accept(Formater formater) {
		return formater.format(this);
	}

}
