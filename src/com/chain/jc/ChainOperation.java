package com.chain.jc;

import java.util.List;

public interface ChainOperation {
	
	public void setNextOperationChain(ChainOperation calculationHandler);
	public void executeOperation(List<String> problem)throws Exception;

}
