package com.regex.blessie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSamples {
	
	private static String inputText;
	
	public static void main(String[] args) throws IOException {
		inputText = new String(Files.readAllBytes(Paths.get("resources/waldo.xml")));
		findWaldoWithGrouping();
		findWaldoLine();	
		lookForwardToWaldo();
	}
	
	private static void findWaldoLine() {
		System.out.println("findWaldoLine");
		String patternString = "\\<waldo\\>.*\\</waldo\\>";
		wheresWaldo(patternString, inputText);
	}
	
	private static void findWaldoWithGrouping() {
		System.out.println("findWaldo");
		String patternString = "(\\<waldo\\>.*\\</waldo\\>)";
		wheresWaldo(patternString, inputText);
	}
		
	private static void lookForwardToWaldo() {
		System.out.println("lookForwardToWaldo");
		String patternString = "((?=\\<waldo\\>).*\\</waldo\\>)";
		wheresWaldo(patternString, inputText);
	}
			
	private static Duration wheresWaldo(String patternString, String inputText){
		Pattern pattern = Pattern.compile(patternString);

		Instant start = Instant.now();

		for (int i=0; i<10000; i++) {
			Matcher matcher = pattern.matcher(inputText);
			while (matcher.find()) {
//	            System.out.println(matcher.group());
			}
		}
		
		Instant end = Instant.now();
		Duration timeElapsed = getExecutionTime(start, end);
		printExecutionTime(timeElapsed);
		return timeElapsed;
	}
	
	private static void printExecutionTime(Duration timeElapsed){
        System.out.println("elapsed time ( milliseconds ):..."+timeElapsed.toMillis());
        System.out.println("=======================");
	}

	private static Duration getExecutionTime(Instant start, Instant end) {
		Duration timeElapsed = Duration.between(start, end);
		return timeElapsed;
	}

}
