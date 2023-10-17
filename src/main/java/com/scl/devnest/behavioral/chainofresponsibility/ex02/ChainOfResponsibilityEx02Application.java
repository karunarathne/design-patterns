package com.scl.devnest.behavioral.chainofresponsibility.ex02;

public class ChainOfResponsibilityEx02Application {
    public static void main(String[] args) {
        AuthenticationHandler usernamePasswordHandler = new UsernamePasswordAuthenticationHandler();
        AuthenticationHandler apiKeyHandler = new APIKeyAuthenticationHandler();

        usernamePasswordHandler.setNext(apiKeyHandler);

        AuthRequest request1 = new AuthRequest("UsernamePassword");
        usernamePasswordHandler.authenticate(request1);

        AuthRequest request2 = new AuthRequest("APIKey");
        usernamePasswordHandler.authenticate(request2);

        AuthRequest request3 = new AuthRequest("JWT");
        usernamePasswordHandler.authenticate(request3);
    }
}
