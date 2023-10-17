package com.scl.devnest.creational.objectpool;

import java.util.LinkedList;
import java.util.Queue;

public class EmailClientPoolManager {
    private static final EmailClientPoolManager poolManager = new EmailClientPoolManager();
    private static final int POOL_SIZE = 5;
    private final Queue<EmailClient> pool;

    private EmailClientPoolManager() {
        pool = new LinkedList<>();
        for(int i = 0; i < POOL_SIZE; i++) {
            pool.offer(new EmailClient(i + 1));
        }
    }

    public static EmailClient borrowClient() throws InterruptedException {
        System.out.println("Thread [" + Thread.currentThread().getName() + "] is waiting for borrow request.");
        synchronized (poolManager.pool) {
            while(poolManager.pool.isEmpty()) {
                poolManager.pool.wait();
            }
            return poolManager.pool.poll();
        }
    }

    public static void returnClient(EmailClient client) {
        System.out.println("Thread [" + Thread.currentThread().getName() + "] is returning EmailClient with ID [" + client.getId() + "]");
        synchronized (poolManager.pool) {
            //do something to reset/sanitize client if required
            poolManager.pool.offer(client);
            poolManager.pool.notifyAll();
        }
    }
}
