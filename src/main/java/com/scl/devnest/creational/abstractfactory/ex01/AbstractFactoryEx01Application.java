package com.scl.devnest.creational.abstractfactory.ex01;

public class AbstractFactoryEx01Application {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape();
        shape.draw();

        AbstractFactory colorFactory = new ColorFactory();
        Color color = colorFactory.createColor();
        color.fill();
    }
}
