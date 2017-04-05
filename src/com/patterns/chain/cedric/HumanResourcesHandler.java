package com.patterns.chain.cedric;

public class HumanResourcesHandler extends  AbstractLeaveApprovalHandler {
	public HumanResourcesHandler() {
		//If all the rules are followed, try to send tot the suppervisor for approval
		this.setNext(new SupervisorHandler());
	} 
	
	@Override
	public void handle(LeaveRequest request) {
		
		if(request.getEmployeeDetails().isProbationaryYN()) {
			System.out.println("NOT APPROVED! Probationary employees have no rights-- I mean leaves!");
		}else if(request.getLeaveType() == LeaveType.VACATION && request.getEmployeeDetails().getRemainingVacationleaves() < request.getNumberOfDays()) {
			System.out.println("NOT APPROVED! Insufficent vacation leaves.");
		} else if (request.getLeaveType() == LeaveType.SICK && request.getEmployeeDetails().getRemainingSickLeaves() < request.getNumberOfDays()) {
			System.out.println("NOT APPROVED! Insufficent sick leaves.");
		} else if(request.getLeaveType() == LeaveType.EMERGENCY) {
			//It's an emergency, auto approve!
			System.out.println("APPROVED. Do not worry, we will notify the related persons");
		} else if (request.getLeaveType() == LeaveType.SICK && request.getNumberOfDays() == 1) {
			//sick for 1 day 
			System.out.println("APPROVED. get well soon!");
		} else if (request.getLeaveType() == LeaveType.SICK && request.getNumberOfDays() > 1) {
			//sick for more than a day
			System.out.println("PENDING. be sure to submit your medical certificate!");
		} else {
			callnext(request);
		}
	}

}
