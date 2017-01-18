package com.regex.pau;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regextraordinary {
    
    //http://www.javaworld.com/article/2077757/core-java/optimizing-regular-expressions-in-java.html

    public static void main(String[] args) {
        //Pattern.compile() vs Pattern.matches()
        String text = "ia! ia! cthulhu fthagn";
        String patternString = ".*cthulhu.*";
        Pattern pattern = Pattern.compile(patternString);
        Date matcherStart = new Date();
        for(int i = 0; i < 10000; i++) {
            Matcher matcher = pattern.matcher(text);
            matcher.matches();
        }
        Date matcherEnd = new Date();
        System.out.println("Using matcher: " + (matcherEnd.getTime() - matcherStart.getTime()));
        

        Date matchesStart = new Date();
        for(int i = 0; i < 10000; i++) {
            Pattern.matches(patternString, text);
        }
        Date matchesEnd = new Date();
        System.out.println("Using matches: " + (matchesEnd.getTime() - matchesStart.getTime()));
        
        //Alternation
        String badAlternationPattern = "(smite|small|smoke|smeagol)";
        String betterAlternationPattern = "sm(ite|all|oke|eagol)";
        
        Pattern alternationPattern = Pattern.compile(badAlternationPattern); 
        Date badAlternationStart = new Date();
        for(int i = 0; i < 10000; i++) {
            Matcher matcher = alternationPattern.matcher("smeagol");
            matcher.matches();
        }
        Date badAlternationEnd = new Date();
        System.out.println("Using bad alternation: " + (badAlternationEnd.getTime() - badAlternationStart.getTime()));
        
        alternationPattern = Pattern.compile(betterAlternationPattern); 
        Date betterAlternationStart = new Date();
        for(int i = 0; i < 10000; i++) {
            Matcher matcher = alternationPattern.matcher("smeagol");
            matcher.matches();
        }
        Date betterAlternationEnd = new Date();
        System.out.println("Using better alternation: " + (betterAlternationEnd.getTime() - betterAlternationStart.getTime()));
        
        //Optimize for engine
        text = "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890cthulhu1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890cthulhu";
        Date startTime = new Date();
        String regex = ".*cthulhu.*";
        Pattern notOptimized = Pattern.compile(regex);
        for(int i = 0; i < 10000; i++) {
            Matcher matcher = notOptimized.matcher(text);
            matcher.matches();
        }
        Date endTime = new Date();
        System.out.println("Using not optimized: " + (endTime.getTime()-startTime.getTime()));
        

        regex = ".{100}cthulhu.*";
        Pattern optimized = Pattern.compile(regex);
        startTime = new Date();
        for(int i = 0; i < 10000; i++) {
            Matcher matcher = optimized.matcher(text);
            matcher.matches();
        }
        endTime = new Date();
        System.out.println("Using optimized: " + (endTime.getTime()-startTime.getTime()));
        
        //Possessive quantifiers
        text = "azatoth";
        startTime = new Date();
        regex = "[^e]*b";
        notOptimized = Pattern.compile(regex);
        for(int i = 0; i < 10000; i++) {
            Matcher matcher = notOptimized.matcher(text);
            matcher.matches();
        }
        endTime = new Date();
        System.out.println("Using not optimized: " + (endTime.getTime()-startTime.getTime()));

        startTime = new Date();
        regex = "[^e]*+b";
        notOptimized = Pattern.compile(regex);
        for(int i = 0; i < 10000; i++) {
            Matcher matcher = notOptimized.matcher(text);
            matcher.matches();
        }
        endTime = new Date();
        System.out.println("Using optimized: " + (endTime.getTime()-startTime.getTime()));
        
    }
}
