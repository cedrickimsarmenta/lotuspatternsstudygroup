package com.patterns.ralph.memento;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LevelQuestionMapping {

	private static Map<Level,List<QuestionAnswer>> questionAnswerList = new HashMap<>();
	static{
		
		List<QuestionAnswer> level0Q = 
				Arrays.asList(new QuestionAnswer("What is Batmans favorite Color","Pink",Arrays.asList("Pink","Black","Yellow","Brown"))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
				);
		questionAnswerList.put(Level.LEVEL0, level0Q);
		List<QuestionAnswer> level1Q = 
				Arrays.asList(new QuestionAnswer("In the children's book series, where is Paddington Bear originally from?","Peru",Arrays.asList("India","Canada","Peru","Iceland"))
				,new QuestionAnswer("What character has a square pants","",Arrays.asList("Sponge Bob","Patrick","Mr. Krabs","Squidward"))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
				);
		questionAnswerList.put(Level.LEVEL1, level1Q);
		
		List<QuestionAnswer> level2Q = Arrays.asList(new QuestionAnswer("What did the milkfish say when it was going to die?","Im Daing",Arrays.asList("Im Tuna","Im Daing","Im Dead","That's Life"))
				,new QuestionAnswer("What did the milkfish say when it was going to die?","Im Daing",Arrays.asList("Im Tuna","Im Daing","Im Dead","That's Life"))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
				);
		questionAnswerList.put(Level.LEVEL2, level2Q);
		
		List<QuestionAnswer> level3Q = Arrays.asList(new QuestionAnswer("Question 3","3",Arrays.asList("3","1","2","5"))
//				,new QuestionAnswer("Wh","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
				);
		questionAnswerList.put(Level.LEVEL3, level3Q);
		
		List<QuestionAnswer> level4Q = Arrays.asList(new QuestionAnswer("Question 4","4",Arrays.asList("5","3","9","4"))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
				);
		questionAnswerList.put(Level.LEVEL4, level4Q);
		
		List<QuestionAnswer> level5Q = Arrays.asList(new QuestionAnswer("Question 5","5",Arrays.asList("3","1","2","5"))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
				);
		questionAnswerList.put(Level.LEVEL5, level5Q);
		
		List<QuestionAnswer> level6Q = Arrays.asList(new QuestionAnswer("Question 6","",Arrays.asList("2","1","6","3"))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
				);
		questionAnswerList.put(Level.LEVEL6, level6Q);
		
		List<QuestionAnswer> level7Q = Arrays.asList(new QuestionAnswer("Question 7","7",Arrays.asList("7","6","8","9"))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
				);
		questionAnswerList.put(Level.LEVEL7, level7Q);
		
		List<QuestionAnswer> level8Q = Arrays.asList(new QuestionAnswer("Question 8","8",Arrays.asList("2","5","8","10"))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
				);
		questionAnswerList.put(Level.LEVEL8, level8Q);
		
		List<QuestionAnswer> level9Q = Arrays.asList(new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
				);
		questionAnswerList.put(Level.LEVEL9, level9Q);
		
		
		List<QuestionAnswer> level10Q = Arrays.asList(new QuestionAnswer("Question 10","10",Arrays.asList("1","5","7","10"))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
//				,new QuestionAnswer("","",Arrays.asList("","","",""))
				);
		questionAnswerList.put(Level.LEVEL10, level10Q);
	}

	public static Map<Level,List<QuestionAnswer>> getQuestionAnswerList() {
		return Collections.unmodifiableMap(questionAnswerList);
	}

	
}
