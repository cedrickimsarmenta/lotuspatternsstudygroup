package com.patterns.chain.cedric;

public class OfficeManagerHandler extends AbstractLeaveApprovalHandler{

	@Override
	public void handle(LeaveRequest request) {
		//No next. This is the last line of approval
		System.out.println("PENDING! Because your supervisor is absent today, your request has been forwarded to the office manager for approval");
	}

}
