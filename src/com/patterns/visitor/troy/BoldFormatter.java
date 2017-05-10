package com.patterns.visitor.troy;

public class BoldFormatter implements Formater {

	@Override
	public String format(LetterA a) {
		return "<b>" + a.getValue() + "</b>";
	}

	@Override
	public String format(LetterB b) {
		return "<b>" + b.getValue() + "</b>";
	}
	
	

}
