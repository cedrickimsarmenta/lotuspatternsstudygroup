package com.patterns.chain.cedric;

import java.util.Date;

public class LeaveProcessor {
	public static void main(String[] args) {
		LeaveApprovalHandler initialHandler = new CEOHandler();

		EmployeeDetails details = null;
		LeaveRequest leaveRequest = null;
		
		
		//CEO request for a leave
		details = new EmployeeDetails(false, "RobertBarratheon", 0, 0, "RobertBarratheon");
		leaveRequest  = new LeaveRequest(LeaveType.VACATION, 50, new Date(), details);
		System.out.println("Submitting leave request " + leaveRequest);
		initialHandler.handle(leaveRequest);
		
		//Probationary requests for a leave
		details = new EmployeeDetails(true, "RobertBarratheon", 0, 0, "NedStark");
		leaveRequest  = new LeaveRequest(LeaveType.VACATION, 1, new Date(), details);
		System.out.println("Submitting leave request " + leaveRequest);
		initialHandler.handle(leaveRequest);
		
		//regular employee wants to go on VL, but has no more credits
		details = new EmployeeDetails(false, "RobertBarratheon", 0, 0, "CerseiLannister");
		leaveRequest  = new LeaveRequest(LeaveType.VACATION, 1, new Date(), details);
		System.out.println("Submitting leave request " + leaveRequest);
		initialHandler.handle(leaveRequest);
		

		//regular employee wants to go on 1 day sick leave
		details = new EmployeeDetails(false, "RobertBarratheon", 10, 10, "CerseiLannister");
		leaveRequest  = new LeaveRequest(LeaveType.SICK, 1, new Date(), details);
		System.out.println("Submitting leave request " + leaveRequest);
		initialHandler.handle(leaveRequest);

		
		//regular employee wants to go on 2 day sick leave
		details = new EmployeeDetails(false, "RobertBarratheon", 10, 10, "CerseiLannister");
		leaveRequest  = new LeaveRequest(LeaveType.SICK, 2, new Date(), details);
		System.out.println("Submitting leave request " + leaveRequest);
		initialHandler.handle(leaveRequest);
		

		//regular employee wants to go on vacation leave, his supervisor is presnet
		details = new EmployeeDetails(false, "RobertBarratheon", 10, 10, "CerseiLannister");
		leaveRequest  = new LeaveRequest(LeaveType.VACATION, 2, new Date(), details);
		System.out.println("Submitting leave request " + leaveRequest);
		initialHandler.handle(leaveRequest);

		//regular employee wants to go on vacation leave, his supervisor is absent
		details = new EmployeeDetails(false, "OLAF", 10, 10, "Elsa");
		leaveRequest  = new LeaveRequest(LeaveType.VACATION, 2, new Date(), details);
		System.out.println("Submitting leave request " + leaveRequest);
		initialHandler.handle(leaveRequest);
				
				
		
	}
}
