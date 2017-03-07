package com.concurrency.cedric;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    	
    	try {
    		String nInput = br.readLine();
    		
    		String numbersInput = br.readLine();
    		
    		List<Integer> numberList = new ArrayList<Integer>();
			for(String numberString : numbersInput.split(" ")) {
				numberList.add(Integer.parseInt(numberString));
			}
			System.out.println(findMinDelta(Integer.parseInt(nInput), numberList));
			
		} catch (IOException e) {
			System.out.println(0);
		}
    	
    }
    
    public static int findMinDelta(Integer n, List<Integer> numberList) {
    	int changes = 0;
    	
    	while (true) {
    		Integer candidate = changeCandidate(numberList);
    		
    		if(candidate == null) {
    			break;
    		}
    		
    		int incrementCost = inrementCost(numberList,candidate);
    		int decrementCost = decrementCost(numberList, candidate);
    		if(incrementCost <= decrementCost) {
    			incrementNext(numberList, candidate);
    		} else {
    			decrementPrevious(numberList, candidate);
    		}
    		//Increment the candidate;
    		changes++;
    		
    		if(changes > numberList.size()) {
    			return numberList.size();
    		}
    		
    	}
    		
    	return changes;
    }

    private static int decrementCost(List<Integer> numberList, Integer candidate) {
    	//The first candidate is always safe to decrement
    	if(candidate == 0) {
    		return -1;
    	}
    	
    	List<Integer> newNumberList = new ArrayList<>();
    	newNumberList.addAll(numberList);
    	decrementPrevious(newNumberList, candidate);
		
    	//Check if decrement will produce conflicts
    	if(newNumberList.get(candidate) <= newNumberList.get(candidate -1)) {
    		//Resulted in having same number. Expensive
    		return 1;
    	}
    	
    	return 0;
    }
    
    private static int inrementCost(List<Integer> numberList, Integer candidate) {
    	//If candidate has only one more element to the right, it is always safe to increment
    	if(candidate == numberList.size() - 2 ) {
    		return -1;
    	}
    	
    	List<Integer> newNumberList = new ArrayList<>();
    	newNumberList.addAll(numberList);
    	incrementNext(newNumberList, candidate);
		
    	//Check if incremnt will produce conflicts
    	if(newNumberList.get(candidate + 1) == newNumberList.get(candidate +2)) {
    		//Resulted in having same number. Expensive
    		return 1;
    	}
    	return 0;
    }
    
	private static void incrementNext(List<Integer> numberList, Integer candidate) {
		Integer difference = numberList.get(candidate) - numberList.get(candidate+1);
		Integer incrementValue = difference / 2;
		
		//diff of 1
		if(incrementValue == 0) {
			incrementValue = 1;
		}
		
		numberList.set(candidate + 1, numberList.get(candidate) + 1);
	}
    
	private static void decrementPrevious(List<Integer> numberList, Integer candidate) {
		Integer difference = numberList.get(candidate) - numberList.get(candidate+1);
		Integer incrementValue = difference / 2;
		
		//diff of 1
		if(incrementValue == 0) {
			incrementValue = 1;
		}
		
		
		numberList.set(candidate, numberList.get(candidate + 1) - incrementValue);
	}
    
    public static Integer changeCandidate(List<Integer> numberList) {
    	
    	for(int i = 0 ; i < numberList.size() - 1 ; i++) {
    		int currentNumber = numberList.get(i);
    		int nextNumber = numberList.get(i+1);
    		if(currentNumber >= nextNumber) {
    			return i;
    		}
    	}
    	
    	return null;
    }
}
