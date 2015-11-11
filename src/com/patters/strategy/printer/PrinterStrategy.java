package com.patters.strategy.printer;

public interface PrinterStrategy {
public void print(String fileName);
public String getPrinterName();
public int getPrintingSpeed();
public void printByColorType(ColorType fileColorType);
}
