package com.scl.devnest.creational.singleton.ex01;

public class SingletonEx01Application {
    public static void main(String[] args) {
        ResourceManager resourceManager = ResourceManager.getInstance();
        resourceManager.setStatus("HEALTHY");

        System.out.println("Resource Status: " + resourceManager.getStatus());
    }
}
