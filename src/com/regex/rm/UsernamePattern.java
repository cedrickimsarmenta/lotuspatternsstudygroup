package com.regex.rm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernamePattern implements RegexPattern{

	@Override
	public boolean validateValue(String value) {
		 Pattern pattern = Pattern.compile("^[a-z0-9]{8,16}"); 
		 Matcher match = pattern.matcher(value);
		 return match.matches();
	}


}
