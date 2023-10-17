package com.scl.devnest.creational.singleton.ex01;

public class ResourceManager {

    private static ResourceManager instance;

    private String status;

    private ResourceManager() {
        super();
    }

    public static ResourceManager getInstance() {
        if(instance == null) {
            instance = new ResourceManager();
        }

        return instance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
