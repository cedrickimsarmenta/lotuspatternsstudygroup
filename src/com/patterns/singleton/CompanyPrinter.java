package com.patterns.singleton;

import java.io.File;

public class CompanyPrinter {

	private static CompanyPrinter instance;
	private Printer printer;

	public Printer getPrinter() {
		return printer;
	}
	
	
	protected CompanyPrinter() {
		
	}
	
	public void setup() {
		System.out.println("Setting up driver canon");
	}
	public static CompanyPrinter getDefaultInstance() {
		return new CompanyPrinter();
	}
	public static class EpsonCompanyPrinter extends CompanyPrinter {
		@Override
		public void setup() {
			System.out.println("Setting up driver epson");
		}
		
		private EpsonCompanyPrinter () {
		}
	}
	public static class Printer {
		private String name;

		@Override
		public String toString() {
			return "Printer [name=" + name + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Printer(String name) {
			super();
			this.name = name;
		}

	}

	public static synchronized CompanyPrinter getInstance() {
		if (instance == null) {
			instance = new CompanyPrinter();
		}
		return instance;
	}
	

	public static synchronized CompanyPrinter getInstance(CompanyPrinter instance) {
		if (CompanyPrinter.instance == null) {
			CompanyPrinter.instance = instance;
		}
		return instance;
	}
	

	
	public static synchronized CompanyPrinter getEpsonInstance() {
		if (instance == null) {
			instance = new EpsonCompanyPrinter();
		}
		return instance;
	}

	public static Developer loginStatic() {
		//CONNECT TO DB
		//VALIDATE USERNAME AND PASSWORDPASSOWRD
		Developer developer = null;
				
		//JDBC STUFF HERE
		
		return developer;
	}
	public Developer login() {
		//CONNECT TO DB
		//VALIDATE USERNAME AND PASSWORDPASSOWRD
		Developer developer = null;
				
		//JDBC STUFF HERE
		
		return developer;
	}

	public void printDocument(File file) {
		System.out.println("Printing file " + file);
		throw new RuntimeException("Printer not found");
	}

	public static void printDocumentStatic(File file) {
		System.out.println("Scanning network "+file);
		System.out.println("Printing file "+file);
		throw new RuntimeException("Network not found");
	}
}
