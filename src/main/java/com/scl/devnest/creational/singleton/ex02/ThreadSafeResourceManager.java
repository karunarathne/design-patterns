package com.scl.devnest.creational.singleton.ex02;

public class ThreadSafeResourceManager {
    private static volatile ThreadSafeResourceManager instance;

    private String status;

    private ThreadSafeResourceManager() {
        super();
    }

    public static ThreadSafeResourceManager getInstance() {
        if(instance == null) {
            synchronized (ThreadSafeResourceManager.class) {
                instance = new ThreadSafeResourceManager();
            }
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
