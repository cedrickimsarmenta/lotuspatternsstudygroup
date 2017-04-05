package com.patterns.chain.cedric;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SupervisorHandler extends AbstractLeaveApprovalHandler{
	private Set<String> absentSupervisors = new HashSet();
	
	public SupervisorHandler() {
		//If supervisor is absent, notify the office manager
		this.setNext( new OfficeManagerHandler());
		//A list of absent supervisors!
		absentSupervisors.add("GASTON");
		absentSupervisors.add("OLAF");
	}
	
	@Override
	public void handle(LeaveRequest request) {
		if(!absentSupervisors.contains(request.getEmployeeDetails().getSupervisor())) {
			System.out.println("PENDING! The request has been forwarded to your supervisor " + request.getEmployeeDetails().getSupervisor() + " for approval");
		} else {
			callnext(request);
		}
		
	}

}
