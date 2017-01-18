package com.regex.rm;

public class Regex {

    /**
     * Regex is a sequence of characters that define a search pattern.
	Usually this pattern is then used by string searching algorithms for "find" or "find and replace" operations on strings.
     * @throws RegExPatternNotFoundException 
	**/
	
	public static void main(String[]args) throws RegExPatternNotFoundException{
		
//		.		 	Matches any character
//		^regex   	Finds regex that must match at the beginning of the line.
//		regex$		Finds regex that must match at the end of the line.
//		[abc]		Set definition, can match the letter a or b or c.
//		[abc][vz]	Set definition, can match a or b or c followed by either v or z.
//		[^abc]		When a caret appears as the first character inside square brackets, it negates the pattern. This pattern matches any character except a or b or c.
//		[a-d1-7]	Ranges: matches a letter between a and d and figures from 1 to 7, but not d1.
//		X|Z			Finds X or Z.
//		XZ			Finds X directly followed by Z.
//		$			Checks if a line end follows.

		
//		Account account = createAccount();
//		String error = validateBean(account);
//		if(error != null){
//			System.out.println(error);
//		}else{
//			System.out.println("Validation Successfull");
//		}
		
		String pattern = "this[a-zA-Z]+is\\s+text";
		String value = "xthisasdsais     text";
		System.out.println(value.matches(pattern));
		System.out.println(value.replaceFirst(pattern, "M"));
	}
	
	public static Account createAccount(){
	   	Account account = new Account();
	   	account.setEmail("asdsad@yahoo.com");
	   	account.setPassword("qwe123");
	   	account.setUsername("sa12mple");
	   	return account;
	}
	
	
	public static String validateBean(Account account) throws RegExPatternNotFoundException{
		RegexPattern pattern = PatternFactory.getRegExPattern(RegExEnum.USERNAME);
		if(!pattern.validateValue(account.getUsername())){
			return "invalid username ";
		}
		pattern = PatternFactory.getRegExPattern(RegExEnum.PASSWORD);
		if(!pattern.validateValue(account.getPassword())){
			return "invalid password ";
		}
		pattern = PatternFactory.getRegExPattern(RegExEnum.EMAIL);
		if(!pattern.validateValue(account.getEmail())){
			return "invalid email ";
		}
		return null;
	}
	
	
}
