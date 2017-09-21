package com.patterns.ralph.memento;

public enum Level {

	LEVEL0(0,0),LEVEL1(1,10000),LEVEL2(2,20000),LEVEL3(3,30000),LEVEL4(4,50000),LEVEL5(5,100000),LEVEL6(6,200000)
	,LEVEL7(7,300000),LEVEL8(8,500000),LEVEL9(9,600000),LEVEL10(10,1000000);
	private int level;
	private int amount;
	
	private Level(int level,int amount){
		this.level = level;
		this.amount = amount;
	}
	
	public int getAmount(){
		return amount;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public static Level getLevlByLevelId(int level) throws Exception{
		for(Level l:Level.values()){
			if(l.getLevel() == level){
				return l;
			}
		}
		throw new Exception("Invlid Level");
	}
}
