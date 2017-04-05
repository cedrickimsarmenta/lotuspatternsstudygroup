package com.patterns.chain.cedric;

public interface LeaveApprovalHandler {
	LeaveApprovalHandler getNext();
	void setNext(LeaveApprovalHandler next);
	void handle(LeaveRequest request);
}
