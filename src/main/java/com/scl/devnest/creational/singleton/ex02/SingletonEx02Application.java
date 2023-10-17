package com.scl.devnest.creational.singleton.ex02;

public class SingletonEx02Application {
    public static void main(String[] args) {
        ThreadSafeResourceManager resourceManager = ThreadSafeResourceManager.getInstance();
        resourceManager.setStatus("HEALTHY");
        System.out.println("Status: " + resourceManager.getStatus());
    }
}
