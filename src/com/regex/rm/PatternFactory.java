package com.regex.rm;

public class PatternFactory {
	
	

	public static RegexPattern getRegExPattern(RegExEnum regExEnum) throws RegExPatternNotFoundException{
		
		switch(regExEnum){
		case USERNAME:
			return new UsernamePattern();
		case PASSWORD:
			return new PasswordPattern();
		case EMAIL:
			return new EmailPattern();
		default:
		    throw new RegExPatternNotFoundException();
		}
	}

}
