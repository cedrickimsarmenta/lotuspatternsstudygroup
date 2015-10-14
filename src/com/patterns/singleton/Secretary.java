package com.patterns.singleton;

import java.io.File;
import java.math.BigDecimal;

public class Secretary {
	
	public  int companyBalance = 100000;
	public void distributeSalary(Developer developer, int amount) {
		if(companyBalance > amount) {
			developer.atmBalance += amount;
			companyBalance -= amount;
			File file = new File("payslip.txt");
//			CompanyPrinter.printDocumentStatic(file);
			CompanyPrinter.getEpsonInstance().printDocument(file);
		}
	}
	
	public void timeIn(String username, String password) {
		Developer developer = CompanyPrinter.loginStatic();
		System.out.println("Logging in devloper "+developer);
	}
}
