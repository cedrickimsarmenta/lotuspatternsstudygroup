package com.patterns.java8;

public class HorseRacingDividend {
	private String outcomeFeedCode1;
	private String outcomeFeedCode2;
	private String outcomeFeedCode3;
	private String outcomeFeedCode4;
	private String outcomeFeedCode5;
	
	public String getOutcomeFeedCode1() {
		return outcomeFeedCode1;
	}
	public void setOutcomeFeedCode1(@WinnerFeedCode(index=1) String outcomeFeedCode1) {
		this.outcomeFeedCode1 = outcomeFeedCode1;
	}
	public String getOutcomeFeedCode2() {
		return outcomeFeedCode2;
	}
	public void setOutcomeFeedCode2(@WinnerFeedCode(index=2) String outcomeFeedCode2) {
		this.outcomeFeedCode2 = outcomeFeedCode2;
	}
	public String getOutcomeFeedCode3() {
		return outcomeFeedCode3;
	}
	public void setOutcomeFeedCode3(@WinnerFeedCode(index=3) String outcomeFeedCode3) {
		this.outcomeFeedCode3 = outcomeFeedCode3;
	}
	public String getOutcomeFeedCode4() {
		return outcomeFeedCode4;
	}
	public void setOutcomeFeedCode4(@WinnerFeedCode(index=4) String outcomeFeedCode4) {
		this.outcomeFeedCode4 = outcomeFeedCode4;
	}

	public void setOutcomeFeedCode5(@WinnerFeedCode(index=5) String outcomeFeedCode5) {
		this.outcomeFeedCode5 = outcomeFeedCode5;
	}
	@Override
	public String toString() {
		return "HorseRacingDividend [outcomeFeedCode1=" + outcomeFeedCode1 + ", outcomeFeedCode2=" + outcomeFeedCode2
				+ ", outcomeFeedCode3=" + outcomeFeedCode3 + ", outcomeFeedCode4=" + outcomeFeedCode4
				+ ", outcomeFeedCode5=" + outcomeFeedCode5 + "]";
	}
	
	
}