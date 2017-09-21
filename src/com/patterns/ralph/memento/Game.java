package com.patterns.ralph.memento;

public abstract class Game {

	private Level level;
	private Level state;

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public void saveState(Level level) {
		state = level;
		
	}

	public Level getState() {
		return state;
	}

	public void setState(Level state) {
		this.state = state;
	}
	
	public void startGame(){
		this.level = Level.LEVEL0;
		this.state = Level.LEVEL0;
	}

	public Level nextLevel() throws Exception {
		int currntLevel = level.getLevel();
		int nextLevel = ++currntLevel;
		this.level = Level.getLevlByLevelId(nextLevel);
		return level;
		
	}
}
