package com.patterns.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReflection {
	private static class HorseRacingDividend {
		private String outcomeFeedCode1;
		private String outcomeFeedCode2;
		private String outcomeFeedCode3;
		private String outcomeFeedCode4;
		public String getOutcomeFeedCode1() {
			return outcomeFeedCode1;
		}
		public void setOutcomeFeedCode1(String outcomeFeedCode1) {
			this.outcomeFeedCode1 = outcomeFeedCode1;
		}
		public String getOutcomeFeedCode2() {
			return outcomeFeedCode2;
		}
		public void setOutcomeFeedCode2(String outcomeFeedCode2) {
			this.outcomeFeedCode2 = outcomeFeedCode2;
		}
		public String getOutcomeFeedCode3() {
			return outcomeFeedCode3;
		}
		public void setOutcomeFeedCode3(String outcomeFeedCode3) {
			this.outcomeFeedCode3 = outcomeFeedCode3;
		}
		public String getOutcomeFeedCode4() {
			return outcomeFeedCode4;
		}
		public void setOutcomeFeedCode4(String outcomeFeedCode4) {
			this.outcomeFeedCode4 = outcomeFeedCode4;
		}
		@Override
		public String toString() {
			return "HorseRacingDividend [outcomeFeedCode1=" + outcomeFeedCode1 + ", outcomeFeedCode2="
					+ outcomeFeedCode2 + ", outcomeFeedCode3=" + outcomeFeedCode3 + ", outcomeFeedCode4="
					+ outcomeFeedCode4 + "]";
		}
	}
	
	
	public static void main(String[] args) {
		List<String> feedCodes;
		HorseRacingDividend dividend;
		MethodReflection foo = new MethodReflection();

		dividend = new HorseRacingDividend();
		feedCodes = Arrays.asList("BGC:123", "BGC:246");

		System.out.println(dividend);

		
		dividend = new HorseRacingDividend();
		feedCodes = Arrays.asList("BGC:123", "BGC:246", "BGC:369", "BGC:4812");

		foo.setWinningFeedCodesOldSchool(dividend, feedCodes);
		System.out.println(dividend);

		
		dividend = new HorseRacingDividend();
		feedCodes = Arrays.asList("BGC:123", "BGC:246");

		foo.setWinningFeedCodesReflection(dividend, feedCodes);
		System.out.println(dividend);

		dividend = new HorseRacingDividend();
		feedCodes = Arrays.asList("BGC:123", "BGC:246", "BGC:369", "BGC:4812");

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
			String setterName = "setOutcomeFeedCode" + idx++;
			try {
				clz.getDeclaredMethod(setterName, String.class).invoke(dividend, feedCode);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
	}
}
