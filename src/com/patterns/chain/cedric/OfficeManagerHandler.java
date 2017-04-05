package com.patterns.chain.cedric;

public class OfficeManagerHandler extends AbstractLeaveApprovalHandler{

	@Override
	public void handle(LeaveRequest request) {
		System.out.println("PENDING! Your request has been forwarded to the office manager for approval");
	}

}
