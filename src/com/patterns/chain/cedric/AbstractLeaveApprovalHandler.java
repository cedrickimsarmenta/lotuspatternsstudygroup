package com.patterns.chain.cedric;

public abstract class AbstractLeaveApprovalHandler implements LeaveApprovalHandler {
	private LeaveApprovalHandler next;


	@Override
	public LeaveApprovalHandler getNext() {
		return next;
	}

	@Override
	public void setNext(LeaveApprovalHandler next) {
		this.next = next;
	}
	
	
	protected void callnext(LeaveRequest request) {
		if(this.next != null) {
			next.handle(request);
		} else {
			throw new RuntimeException("Request not processed!! " + request );
		}
	}
}
