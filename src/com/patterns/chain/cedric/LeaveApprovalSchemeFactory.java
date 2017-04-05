package com.patterns.chain.cedric;

public class LeaveApprovalSchemeFactory {
	public static LeaveApprovalHandler buildWesterosApprovalScheme() {
		LeaveApprovalHandler ceoApprovalHandler = new CEOHandler();
		LeaveApprovalHandler hrApprovalHandler = new HumanResourcesHandler();
		LeaveApprovalHandler supervisorHandle = new SupervisorHandler();
		LeaveApprovalHandler officeManagerHandler = new OfficeManagerHandler();
		//Either you are the CEO, else you have to pass HR rules, else you have to ask for supervisor approval if he is present, else, you have to ask permission from office manager;
		ceoApprovalHandler.setNext(hrApprovalHandler);
		hrApprovalHandler.setNext(supervisorHandle);
		supervisorHandle.setNext(officeManagerHandler);
		return ceoApprovalHandler;
	}
	
	public static LeaveApprovalHandler buildDisneyApprovalScheme() {
		LeaveApprovalHandler ceoApprovalHandler = new CEOHandler();
		LeaveApprovalHandler hrApprovalHandler = new HumanResourcesHandler();
		LeaveApprovalHandler officeManagerHandler = new OfficeManagerHandler();
		//Either you are the CEO, else you have to pass HR rules,  else, you have to ask permission from office manager. 
		//There are no supervisors in disney
		ceoApprovalHandler.setNext(hrApprovalHandler);
		hrApprovalHandler.setNext(officeManagerHandler);
		return ceoApprovalHandler;
	}
}
