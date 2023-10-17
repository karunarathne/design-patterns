package com.scl.devnest.creational.abstractfactory.ex02;

public class AbstractFactoryEx02Application {
    public static void main(String[] args) {
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        victorianChair.sitOn();
        victorianSofa.lieOn();

        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        modernChair.sitOn();
        modernSofa.lieOn();
    }
}
