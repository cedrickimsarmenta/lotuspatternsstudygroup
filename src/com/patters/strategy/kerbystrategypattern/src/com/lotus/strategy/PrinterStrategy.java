package com.lotus.strategy;

import com.lotus.printer.enums.ColorType;

public interface PrinterStrategy {
public void print(String fileName);
public String getPrinterName();
public int getPrintingSpeed();
public void printByColorType(ColorType fileColorType);
}
