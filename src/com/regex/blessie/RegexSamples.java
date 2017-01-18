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
		findWaldoLine();
		lookForwardToWaldo();
		findWaldo();
	}
	
	private static void findWaldoLine() {
		System.out.println("findWaldoLine");
		String patternString = "\\<waldo\\>.*\\</waldo\\>";
		wheresWaldo(patternString, inputText);
	}
	
	private static void findWaldo() {
		System.out.println("findWaldo");
		String patternString = ".*(\\<waldo\\>.*\\</waldo\\>).*";
		wheresWaldo(patternString, inputText);
	}
		
	private static void lookForwardToWaldo() {
		System.out.println("lookForwardToWaldo");
		String patternString = "((?=\\<waldo\\>).*\\</waldo\\>)";
		wheresWaldo(patternString, inputText);
	}
			
	private static Duration wheresWaldo(String patternString, String inputText){
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(inputText);
		Instant start = Instant.now();

		while (matcher.find()) {
            System.out.println(matcher.group());
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
