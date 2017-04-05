package com.patterns.chain.cedric;

import java.util.Date;

public class LeaveRequest {
	private LeaveType leaveType;
	private int numberOfDays;
	private Date startDateTime;
	private EmployeeDetails employeeDetails;
	public LeaveType getLeaveType() {
		return leaveType;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public Date getStartDateTime() {
		return startDateTime;
	}
	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}
	
	
	public LeaveRequest(LeaveType leaveType, int numberOfDays, Date startDateTime, EmployeeDetails employeeDetails) {
		super();
		this.leaveType = leaveType;
		this.numberOfDays = numberOfDays;
		this.startDateTime = startDateTime;
		this.employeeDetails = employeeDetails;
	}
	@Override
	public String toString() {
		return "ApprovalRequest [leaveType=" + leaveType + ", numberOfDays=" + numberOfDays + ", startDateTime="
				+ startDateTime + ", employeeDetails=" + employeeDetails + "]";
	}
	
	
}
