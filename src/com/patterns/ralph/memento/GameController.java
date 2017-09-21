package com.patterns.ralph.memento;

import java.util.List;

public class GameController {

	private Game game;
	// 0 not started, 1 ongoing, 2 end
	private int status = 0;
	private SaveStateController stateController;
	
	public GameController(int gameMode){
		game = getGameMode(gameMode);
		stateController = getStateController(gameMode);
		game.startGame();
		status = 1;
	}
	
	
	public static Game getGameMode(int gameMode){
		if(gameMode == 1){
			return new NormalGame();
		}
		throw new IllegalArgumentException("Game Mode Not Yet Available");
	}
	public static SaveStateController getStateController(int gameMode){
		if(gameMode == 1){
			return new NormalGameStateController();
		}
		throw new IllegalArgumentException("Game Mode Not Yet Available");
	}
	public Level getCurrentLevel(){
		return game.getLevel();
	}


	public int getStatus() {
		return status;
	}


	public QuestionAnswer getQuestionAnswerChoice() {
		List<QuestionAnswer> qaList = LevelQuestionMapping.getQuestionAnswerList().get(game.getLevel());
		QuestionAnswer qa = qaList.get(0);
		return qa;
	}
	
	public boolean answer(QuestionAnswer qac , String answer) throws Exception{
		boolean correct =false;
		if(qac.getAnswer().equalsIgnoreCase(answer)){
			proceedToNextLevel();
			correct = true;
		}else{
			invalidAnswer();
		}
		return correct;
	}
	
	private void proceedToNextLevel() throws Exception{
		
		if(game.getLevel() != Level.LEVEL10){
			if(game.nextLevel() == Level.LEVEL10){
				System.out.println("This is the last level. When you get this correctly you win "+ Level.LEVEL10.getAmount());
			}
		}else{
			System.out.println("Congratulations you won the game who wants to be a millionaire with price"+ Level.LEVEL10.getAmount());
		}
		stateController.saveState(game);
	}
	
	private void invalidAnswer(){
		this.status = 2;
		game.setLevel(game.getState());
		
		System.out.println("You have answered invalid");
		System.out.println("You won "+ game.getLevel().getAmount());
		
	}

}
