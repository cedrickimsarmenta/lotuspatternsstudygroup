package com.lotus.bean;

import com.lotus.printer.enums.ColorType;
import com.lotus.strategy.PrinterStrategy;


public class PaperFile {
	private int pages;
	private ColorType fileColor;
	private String fileName;
	public PaperFile(int pages, ColorType fileColor, String fileName) {
		super();
		this.pages = pages;
		this.fileColor = fileColor;
		this.fileName = fileName;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public ColorType getFileColor() {
		return fileColor;
	}
	public void setFileColor(ColorType fileColor) {
		this.fileColor = fileColor;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void printPaperFile(PrinterStrategy printerStrategy){
		printerStrategy.print(this.fileName);
		printerStrategy.printByColorType(this.fileColor);
	}
	
	
}
