package com.patterns.chain.cedric;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SupervisorHandler extends AbstractLeaveApprovalHandler{
	private Set<String> absentSupervisors = new HashSet();
	
	public SupervisorHandler() {
		//A list of absent supervisors!
		absentSupervisors.add("TYWIN");
		absentSupervisors.add("THEON");
	}
	
	@Override
	public void handle(LeaveRequest request) {
		if(!absentSupervisors.contains(request.getEmployeeDetails().getSupervisor())) {
			System.out.println("PENDING! The request has been forwarded to your supervisor " + request.getEmployeeDetails().getSupervisor() + " for approval");
		} else {
			System.out.println("Your supervisor " + request.getEmployeeDetails().getSupervisor() + " is ABSENT!!");
			
			callnext(request);
		}
		
	}

}
