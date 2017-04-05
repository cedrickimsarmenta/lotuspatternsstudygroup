package com.patterns.chain.cedric;

import java.util.Date;

public class LeaveProcessor {
	public static void main(String[] args) {
		//FIRST, use westeros approval scheme
		LeaveApprovalHandler initialHandler = LeaveApprovalSchemeFactory.buildWesterosApprovalScheme();
				
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
		details = new EmployeeDetails(false, "TYWIN", 10, 10, "SHAE");
		leaveRequest  = new LeaveRequest(LeaveType.VACATION, 2, new Date(), details);
		System.out.println("Submitting leave request " + leaveRequest);
		initialHandler.handle(leaveRequest);
				
		//NOW, use disney approval scheme
		initialHandler = LeaveApprovalSchemeFactory.buildDisneyApprovalScheme();
		
		//CEO request for a leave
		details = new EmployeeDetails(false, "Mickey", 0, 0, "Mickey");
		leaveRequest  = new LeaveRequest(LeaveType.VACATION, 50, new Date(), details);
		System.out.println("Submitting leave request " + leaveRequest);
		initialHandler.handle(leaveRequest);
		
		
		//regular employee wants to go on vacation leave, it will be routed to the office manager
		details = new EmployeeDetails(false, "PUSS", 10, 10, "SHREK");
		leaveRequest  = new LeaveRequest(LeaveType.VACATION, 2, new Date(), details);
		System.out.println("Submitting leave request " + leaveRequest);
		initialHandler.handle(leaveRequest);
	}
}
