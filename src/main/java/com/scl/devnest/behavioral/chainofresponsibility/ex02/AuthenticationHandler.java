package com.scl.devnest.behavioral.chainofresponsibility.ex02;

public interface AuthenticationHandler {
    public abstract void authenticate(AuthRequest request);
    public abstract void setNext(AuthenticationHandler next);
}
