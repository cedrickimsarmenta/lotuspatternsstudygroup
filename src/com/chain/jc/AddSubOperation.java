package com.chain.jc;

import java.util.List;

public class AddSubOperation extends AbstractOperation {
	ChainOperation calculationHandler;

	@Override
	public void setNextOperationChain(ChainOperation calculationHandler) {
		this.calculationHandler = calculationHandler;

	}

	@Override
	public void executeOperation(List<String> list) throws Exception {
		System.out.println("\nCompute all Addition and Subtraction");
		System.out.println(list);
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).equals("+")) {
				compute(list, index, OperationType.ADDITION);
				index = getIndexToContinue();
			} else if (list.get(index).equals("-")) {
				compute(list, index, OperationType.SUBTRACTION);
				index = getIndexToContinue();
			}
		}

	}
}
