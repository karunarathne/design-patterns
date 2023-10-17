package com.scl.devnest.structural.adapter;

public class EpsonPrinterAdapter implements Printable {

    private EpsonPrinter printer = new EpsonPrinter();

    public void print(String message) {
        printer.doPrint(message);
    }
}
