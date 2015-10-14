package com.patterns.singleton;

import java.io.File;
import java.math.BigDecimal;

public class Developer {
	public int atmBalance = 0;
	public void printAPI() {
		File apiFile = new File("api.txt");
//		CompanyPrinter.printDocumentStatic(apiFile);
		CompanyPrinter.Printer printer = new CompanyPrinter.Printer("cannon "+ Thread.currentThread().getName());
//		System.out.println("printing using " + CompanyPrinter.getInstance(printer).getPrinter());
//		CompanyPrinter.getInstance(printer).printDocument(apiFile);
	}
}
