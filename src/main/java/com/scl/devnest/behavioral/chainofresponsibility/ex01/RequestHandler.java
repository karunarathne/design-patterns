package com.scl.devnest.behavioral.chainofresponsibility.ex01;

public interface RequestHandler {
    public abstract void handleRequest(Request request);
    public abstract void setNext(RequestHandler handler);
}
