package com.patterns.chain.cedric;

public class CEOHandler extends AbstractLeaveApprovalHandler {
	public CEOHandler () {
	}
	@Override
	public void handle(LeaveRequest request) {
		if(request.getEmployeeDetails().getName().equals(request.getEmployeeDetails().getSupervisor())) {
			System.out.println("APPROVED! OMG, your supervisor is yourself. You must be the CEO. We will just let the company know!");
		} else {
			callnext(request);
		}
			
	}

}
