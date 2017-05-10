package com.patterns.visitor.cedric;

public abstract class AbstractWeapon implements Weapon {
	private String name;
	private Integer remainingRounds;
	private Integer maxRounds;
	
	
	protected AbstractWeapon(String name, Integer remainingRounds, Integer maxRounds) {
		super();
		this.name = name;
		this.remainingRounds = remainingRounds;
		this.maxRounds = maxRounds;
	}
	@Override
	public void setRemainingRounds(Integer remainingRounds) {
		this.remainingRounds = remainingRounds;
	}


	@Override
	public String getName() {
		return name;
	}


	@Override
	public Integer getRemainingRounds() {
		return remainingRounds;
	}


	@Override
	public Integer getMaxRounds() {
		return maxRounds;
	}
	
	
}
