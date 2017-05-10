package com.patterns.visitor.troy;

public class ItallicFormatter implements Formater {

	@Override
	public String format(LetterA a) {
		return "<i>" + a.getValue() + "</i>";
	}

	@Override
	public String format(LetterB b) {
		return "<i>" + b.getValue() + "</i>";
	}

}
