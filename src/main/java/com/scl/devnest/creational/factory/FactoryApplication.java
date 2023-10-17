package com.scl.devnest.creational.factory;

public class FactoryApplication {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("CIRCLE");
        shape.draw();
    }
}
