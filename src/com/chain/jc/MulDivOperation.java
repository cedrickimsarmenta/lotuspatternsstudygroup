package com.chain.jc;

import java.util.List;

public class MulDivOperation extends AbstractOperation {
	ChainOperation calculationHandler;
	
	@Override
	public void setNextOperationChain(ChainOperation calculationHandler) {
		this.calculationHandler = calculationHandler;
		
	}

	@Override
	public void executeOperation(List<String> lists) throws Exception {
		System.out.println("\nCompute all Multiplication and Division");
		for (int index = 0 ; index < lists.size() ; index++ ) {
			if (lists.get(index).equals("*")) {
				compute(lists, index, OperationType.MULTIPLICATION);
				index = getIndexToContinue();
			}else if(lists.get(index).equals("/")){
				compute(lists, index, OperationType.DIVISION);
				index = getIndexToContinue();
			}
		}

		calculationHandler.executeOperation(lists);
	}

	

}
