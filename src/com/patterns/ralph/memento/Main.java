package com.patterns.ralph.memento;

import java.util.Scanner;

public class Main {

	
	public static void main(String[]args){
		boolean playing = true;
		System.out.println("Let's play who wants to be a millionaire");
		System.out.println("Please choose game mode");
		Scanner sc = new Scanner(System.in);
		GameController controller = null;
		Scanner answer = null;
		while(playing){
			try{
				String gameModeSc = sc.nextLine();
				int gameMode = Integer.parseInt(gameModeSc);
				controller = new GameController(gameMode);
				while(controller.getStatus() == 1){
					QuestionAnswer qac = controller.getQuestionAnswerChoice();
					System.out.println(qac.getQuestion());
					System.out.println(qac.getChoices());
					 answer = new Scanner(System.in);
					String answerString = answer.nextLine();
					playing = controller.answer(qac,answerString);
					
					
				}
			}catch(IllegalArgumentException e){
				System.out.println(e+". please choose correct game mode");
			} catch (Exception e) {
				playing = false;
				System.out.println("Game crashed "+ e.getMessage());
			}
			
		}
		answer.close();
		sc.close();
	}
	
	
}
