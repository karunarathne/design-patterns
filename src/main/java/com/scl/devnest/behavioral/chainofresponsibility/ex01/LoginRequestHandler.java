package com.scl.devnest.behavioral.chainofresponsibility.ex01;

public class LoginRequestHandler implements RequestHandler {
    private RequestHandler next;

    @Override
    public void handleRequest(Request request) {
        if(canHandleRequest(request)) {
            //handle the request
        } else if(next != null) {
            next.handleRequest(request);
        }
    }

    @Override
    public void setNext(RequestHandler handler) {
        this.next = handler;
    }

    private boolean canHandleRequest(Request request) {
        return true;
    }
}
