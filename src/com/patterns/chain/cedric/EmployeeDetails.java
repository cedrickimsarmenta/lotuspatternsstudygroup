package com.patterns.chain.cedric;

public class EmployeeDetails {
	private String name;
	private boolean probationaryYN;
	private String supervisor;
	private int remainingSickLeaves;
	private int remainingVacationleaves;
	
	public boolean isProbationaryYN() {
		return probationaryYN;
	}
	public String getSupervisor() {
		return supervisor;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [probationaryYN=" + probationaryYN + ", supervisor=" + supervisor
				+ ", remainingSickLeaves=" + remainingSickLeaves + ", remainingVacationleaves="
				+ remainingVacationleaves + "]";
	}
	public EmployeeDetails(boolean probationaryYN, String supervisor, int remainingSickLeaves,
			int remainingVacationleaves, String name) {
		super();
		this.probationaryYN = probationaryYN;
		this.supervisor = supervisor;
		this.remainingSickLeaves = remainingSickLeaves;
		this.remainingVacationleaves = remainingVacationleaves;
		this.name = name;
	}
	public int getRemainingSickLeaves() {
		return remainingSickLeaves;
	}
	public int getRemainingVacationleaves() {
		return remainingVacationleaves;
	}
	public String getName() {
		return name;
	}
	
	
}
