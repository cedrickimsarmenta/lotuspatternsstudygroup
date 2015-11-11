package com.lotus.printer;

import java.util.ArrayList;
import java.util.List;

import com.lotus.bean.PaperFile;
import com.lotus.printer.enums.ColorType;
import com.lotus.strategy.CanonStrategy;
import com.lotus.strategy.EpsonStrategy;
import com.lotus.strategy.PrinterStrategy;

public class PrintingMachine {
	public static void main(String[] args){
		List<PrinterStrategy> printerStrategies = new ArrayList<PrinterStrategy>();
		printerStrategies.add(new CanonStrategy());
		printerStrategies.add(new EpsonStrategy());
		PaperFile resume = new PaperFile(10, ColorType.COLORED,"resume.pdf");
		PaperFile research = new PaperFile(10, ColorType.BLACK,"research.docx");
		PaperFile nbiClearance = new PaperFile(10, ColorType.BLACK,"nbiclearance.pdf");
		List<PaperFile> paperFiles = new ArrayList<PaperFile>();
		paperFiles.add(nbiClearance);
		paperFiles.add(resume);
		paperFiles.add(research);
		for(PrinterStrategy printerStrategy: printerStrategies){
			System.out.println("Start");
			resume.printPaperFile(printerStrategy);
			for(int i = printerStrategy.getPrintingSpeed(); i > 0; i-- ){
				System.out.println("Printing in " + i);
			}
			System.out.println("Done");
		}
		
	}
}
