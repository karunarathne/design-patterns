package com.scl.devnest.behavioral.chainofresponsibility.ex01;

public class ChainOfResponsibilityEx01Application {
    public static void main(String[] args) {
        RequestHandler loginHandler = new LoginRequestHandler();
        RequestHandler statusHandler = new StatusUpdateHandler();
        Request request = new Request();

        loginHandler.setNext(statusHandler);
        loginHandler.handleRequest(request);
    }
}
