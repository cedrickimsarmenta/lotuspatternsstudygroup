package com.lotus.regex;

import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LookAheadRegex {

		public static void main(String[] args) throws URISyntaxException {
			String string1 = "helloboombasticfou";
			String string2 = "helloboombarsticfoofighters";
			String string3 = "helloboombarsticfoobar";
			String regex = "(?=.*bastic)(?!.*foo)";
			String regex2 = "(?!.*bastic)(?=.*foo)";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(string1);
			Pattern pattern2 = Pattern.compile(regex2);
			Matcher matcher2 = pattern2.matcher(string2);
			if (matcher.find()) {
				System.out.println(string1);
			}else{
				System.out.println("You need to learn regex dude!");
			}
			
			if(matcher2.find()){
				System.out.println(string2);
			}else{
				System.out.println("You need to learn regex dude!");
			}
			
			
		}

}
