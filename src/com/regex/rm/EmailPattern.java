package com.regex.rm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPattern implements RegexPattern{

	@Override
	public boolean validateValue(String value) {
		 Pattern pattern = Pattern.compile("([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})"); 
		 Matcher match = pattern.matcher(value);
		 return match.matches();
	}


}
