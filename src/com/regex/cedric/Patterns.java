package com.regex.cedric;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {
    public static void main(String[] args){
        String str = "CountCaterpillarandCat.Catiscool,CaterpillarandCatacombsarenot";
        Pattern regex = Pattern.compile("Catacombs|Caterpillar|(Cat)");
        Matcher matcher = regex.matcher(str);
        List<String> cats = new ArrayList<String>();
 
        while (matcher.find()) {
        	if(matcher.group(1) != null) {
        		cats.add(matcher.group(1));
        	}
        }
         
       System.out.println("There are " + cats.size() + " Cats");
    }
}
