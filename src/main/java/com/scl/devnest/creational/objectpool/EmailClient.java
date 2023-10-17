package com.scl.devnest.creational.objectpool;

public class EmailClient {
    private final Integer id;

    public EmailClient(Integer id) {
        this.id = id;
        System.out.println("Creating new Email client with ID = " + id);
    }

    public Integer getId() {
        return this.id;
    }
}
