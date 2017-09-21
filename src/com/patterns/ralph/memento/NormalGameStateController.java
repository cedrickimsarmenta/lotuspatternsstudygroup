package com.patterns.ralph.memento;

import java.util.Arrays;
import java.util.List;

public class NormalGameStateController implements SaveStateController{

	private static final List<Integer> stateToSave = Arrays.asList(3000,5000,8000,10000); 
	@Override
	public void saveState(Game game) {
		if(stateToSave.contains(game.getLevel().getAmount())){
			System.out.println("You have reached leve" +game.getLevel().getLevel()+"and Price receive will be "+game.getLevel().getAmount() +" when answer is invalid");
			game.saveState(game.getLevel());
		}
		
	}

}
