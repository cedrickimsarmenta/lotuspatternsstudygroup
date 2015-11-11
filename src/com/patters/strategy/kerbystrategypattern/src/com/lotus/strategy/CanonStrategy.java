package com.lotus.strategy;

import com.lotus.printer.enums.ColorType;

public class CanonStrategy implements PrinterStrategy{
	@Override
	public void print(String fileName) {
		System.out.println("Printing " + fileName+" in " + getPrinterName());
	}

	@Override
	public String getPrinterName() {
		return "Canon";
	}

	@Override
	public int getPrintingSpeed() {
		return 10;
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
