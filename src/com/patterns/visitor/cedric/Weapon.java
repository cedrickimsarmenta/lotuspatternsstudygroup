package com.patterns.visitor.cedric;

public interface Weapon {
	public void accept (WeaponVisitor visitor);
	public String getName();
	public Integer getRemainingRounds();
	public Integer getMaxRounds();
	public void setRemainingRounds(Integer remainingRounds);
}
