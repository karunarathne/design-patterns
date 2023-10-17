package com.scl.devnest.structural.adapter;

public class Computer {

    private Printable printer;

    public void setPrinter(Printable printer) {
        this.printer = printer;
    }

    public void print(String message) {
        this.printer.print(message);
    }
}
