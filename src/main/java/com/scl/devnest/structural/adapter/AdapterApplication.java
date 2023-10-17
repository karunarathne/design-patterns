package com.scl.devnest.structural.adapter;

public class AdapterApplication {

    public static void main(String[] args) {
        Printable printer = new EpsonPrinterAdapter();

        Computer computer = new Computer();
        computer.setPrinter(printer);

        computer.print("This is a test print page.");
    }
}
