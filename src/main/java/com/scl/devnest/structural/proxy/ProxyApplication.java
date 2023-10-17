package com.scl.devnest.structural.proxy;

public class ProxyApplication {
    public static void main(String[] args) {
        Image image = new ImageProxy("profile.png");

        //Display for the first time. Will be loaded from disk
        image.display();

        //Displaying again. Loaded image will be used
        image.display();
    }
}
