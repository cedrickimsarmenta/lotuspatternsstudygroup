package com.chain.jc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JCalculator {

	public static void main (String[] args) throws Exception{
		ChainOperation mulDiv = new MulDivOperation();
		ChainOperation addSub = new AddSubOperation();
		mulDiv.setNextOperationChain(addSub);

		String input = "3 * 5 + 10 / 5 * 2";
		List<String> inputs = new ArrayList<String>(Arrays.asList(input.split(" ")));
		mulDiv.executeOperation(inputs);
		
		//3 * 5 + 10 / 5 * 2
		//15 + 10 / 5 * 2
		//15 + 2 * 2
		//15 + 4
		//19
	}
}
