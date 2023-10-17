package com.scl.devnest.creational.abstractfactory.ex01;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }

    @Override
    public Color createColor() {
        return new Blue();
    }
}
