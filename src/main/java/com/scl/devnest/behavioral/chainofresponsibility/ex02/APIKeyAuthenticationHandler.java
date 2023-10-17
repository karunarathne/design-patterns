package com.scl.devnest.behavioral.chainofresponsibility.ex02;

public class APIKeyAuthenticationHandler implements AuthenticationHandler {
    private AuthenticationHandler next;

    @Override
    public void authenticate(AuthRequest request) {
        if("APIKey".equals(request.getAuthType())) {
            System.out.println("API Key authenticated.");
        } else if(next != null) {
            next.authenticate(request);
        } else {
            System.out.println("Invalid authentication type.");
        }
    }

    @Override
    public void setNext(AuthenticationHandler next) {
        this.next = next;
    }
}
