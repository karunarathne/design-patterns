package com.scl.devnest.creational.abstractfactory.ex01;

public class ColorFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Color createColor() {
        return new Pink();
    }
}
