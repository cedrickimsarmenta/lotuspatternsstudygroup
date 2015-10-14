package com.patterns.singleton;

import java.io.File;

public class SecretaryTest {
	public static void main(String[] args) {
		CompanyPrinter.getInstance(new CompanyPrinterMock());
		Secretary secretary = new Secretary();
		Developer developer = new Developer();
		
		assert secretary.companyBalance == 100000;
		assert developer.atmBalance == 0;
		
		secretary.distributeSalary(developer, 50000);
	
		assert secretary.companyBalance == 50000;
		assert developer.atmBalance == 50000;
		
		System.out.println("Passed");
	}
	
	private static class CompanyPrinterMock extends CompanyPrinter {
		private CompanyPrinterMock() {
			
		}
		@Override
		public void printDocument(File file) {
			//DO NOTHING
			System.out.println("Mock printing. This is only a test.");
		}
		
		@Override
		public Developer login() {
			//Return dummy
			return new Developer();
		}
	}
	
}
