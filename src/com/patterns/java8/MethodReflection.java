package com.patterns.java8;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.List;


/**
 * Note, you have to compile with -parameters for this to work.
 * For eclipse, see: http://www.concretepage.com/java/jdk-8/java-8-reflection-access-to-parameter-names-of-method-and-constructor-with-maven-gradle-and-eclipse-using-parameters-compiler-argument
 * @author cedric
 *
 */
public class MethodReflection {
	
	
	
	public static void main(String[] args) {
		List<String> feedCodes;
		HorseRacingDividend dividend;
		MethodReflection foo = new MethodReflection();
		
		//Two outcomes work
		dividend = new HorseRacingDividend();
		feedCodes = Arrays.asList("BGC:123", "BGC:246");

		System.out.println(dividend);

		//Four outcomes still work
		dividend = new HorseRacingDividend();
		feedCodes = Arrays.asList("BGC:123", "BGC:246", "BGC:369", "BGC:4812");

		foo.setWinningFeedCodesOldSchool(dividend, feedCodes);
		System.out.println(dividend);

		
		//FIVE OUTCOMES! Cannot handle this
		dividend = new HorseRacingDividend();
		feedCodes = Arrays.asList("BGC:123", "BGC:246", "BGC:369", "BGC:4812", "BGC:51015");

		foo.setWinningFeedCodesOldSchool(dividend, feedCodes);
		System.out.println(dividend);
		
		
		System.out.println("REFLECTIOn");
		
		dividend = new HorseRacingDividend();
		feedCodes = Arrays.asList("BGC:123", "BGC:246");

		foo.setWinningFeedCodesReflection(dividend, feedCodes);
		System.out.println(dividend);

		dividend = new HorseRacingDividend();
		feedCodes = Arrays.asList("BGC:123", "BGC:246", "BGC:369", "BGC:4812");

		foo.setWinningFeedCodesReflection(dividend, feedCodes);
		System.out.println(dividend);
		
		//FIVE OUTCOMES! EZ
		dividend = new HorseRacingDividend();
		feedCodes = Arrays.asList("BGC:123", "BGC:246", "BGC:369", "BGC:4812", "BGC:51015");

		foo.setWinningFeedCodesReflection(dividend, feedCodes);
		System.out.println(dividend);

		
	}
	

	public  void setWinningFeedCodesOldSchool(HorseRacingDividend dividend, List<String> feedCodes) {
		if(feedCodes.isEmpty()) {
			return;
		}
		
		if(feedCodes.size() >= 1) {
			dividend.setOutcomeFeedCode1(feedCodes.get(0));
		}
		
		if(feedCodes.size() >= 2) {
			dividend.setOutcomeFeedCode2(feedCodes.get(1));
		}
		
		if(feedCodes.size() >= 3) {
			dividend.setOutcomeFeedCode3(feedCodes.get(2));
		}
		
		if(feedCodes.size() >= 4) {
			dividend.setOutcomeFeedCode4(feedCodes.get(3));
		}
	}
	
	public  void setWinningFeedCodesReflection(HorseRacingDividend dividend, List<String> feedCodes) {
		Class<HorseRacingDividend> clz = HorseRacingDividend.class;
		int idx = 1;
		for(String feedCode: feedCodes) {
			try {
				for(Method m : clz.getDeclaredMethods()) {
					Parameter[] parameters = m.getParameters();
					if(parameters.length == 1) {
						Parameter p = parameters[0];
						
						if(!p.isAnnotationPresent(WinnerFeedCode.class)) {
							continue;
						}
						
						WinnerFeedCode winnerFeedCode = p.getDeclaredAnnotationsByType(WinnerFeedCode.class)[0];
						
						if(winnerFeedCode.index() == idx) {
							m.invoke(dividend, feedCode);	
						}
					}
				}
			idx++;	
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
	}
	
	/**
	 * HERE BE DRAGONS:
	 * 
	 * Only use reflections when you have to.
	 * CONS:
	 * 1. Slower than normal method invocation
	 * 2. Dangerous (lots of possibilities for Exceptions, if you are not careful.
	 * 
	 * PROS:
	 * 1. Useful when you cannot pre-determine the appropriate method to use (eg, mapping excel fields based on column header) 
	 * 2. Useful when you want to invoke multiple methods based on a patter (eq, in the past, for junit, method  ends with "...Test")
	 * 
	 */
}
