package com.chain.jc;

import java.util.List;

public abstract class AbstractOperation implements ChainOperation{
	protected int currentIndexToUse;
	
	protected void compute(List<String> numbers, int index, OperationType type) throws Exception {
		int number1;
		int number2;
		this.currentIndexToUse = index - 1;
		number1 = Integer.parseInt(numbers.get(index - 1));
		number2 = Integer.parseInt(numbers.get(index + 1));
		numbers.remove(currentIndexToUse);
		numbers.remove(currentIndexToUse);
		numbers.set(currentIndexToUse, computeByOperationType(number1, number2, type));
		System.out.println(numbers);
	}

	private String computeByOperationType(int number1, int number2, OperationType type) throws Exception {
		switch (type) {
		case MULTIPLICATION:
			return String.valueOf(number1 * number2);
		case DIVISION:
			return String.valueOf(number1 / number2);
		case ADDITION:
			return String.valueOf(number1 + number2);
		case SUBTRACTION:
			return String.valueOf(number1 - number2);
		default:
			throw new Exception("Invalid Operation");
			
		}
	}
	
	protected int getIndexToContinue() {
		return currentIndexToUse;
	}
}
