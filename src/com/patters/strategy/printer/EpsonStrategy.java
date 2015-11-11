package com.patters.strategy.printer;

public class EpsonStrategy implements PrinterStrategy {
	@Override
	public void print(String fileName) {
		System.out.println("Printing " + fileName+" in " + getPrinterName());
	}


	@Override
	public String getPrinterName() {
		return "Epson";
	}

	@Override
	public int getPrintingSpeed() {
		return 5;
	}

	@Override
	public void printByColorType(ColorType fileColorType) {
		if(fileColorType.equals(ColorType.COLORED)){
		 System.out.println("Printing colored file...");
		 return;
		}
		System.out.println("Printing file in black...");
	}

}
