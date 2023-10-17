package com.scl.devnest.creational.objectpool;

public class ObjectPoolApplication {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            new EmailSender(i).start();
        }
    }
}
