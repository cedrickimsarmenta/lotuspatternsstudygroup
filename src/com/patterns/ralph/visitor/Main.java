package com.patterns.ralph.visitor;

public class Main {

	public static void main(String[]args){
//		User king = new User("King Kong",Role.KING);
//		executeVisitor(king);
		
//		User queen = new User("Queen Kong",Role.QUEEN);
//		executeVisitor(queen);
		User commoner = new User("Loser Kong",Role.COMMONER);
		executeVisitor(commoner);
	}
	
	private static void executeVisitor(User user){
		Key key = KeyFactory.getKeyForUser(user);
		Visitor visitor = new DoorVisitor() ;
		//visitor.visit(key);
		key.accept(visitor);
	}
}
