package com.scl.devnest.behavioral.chainofresponsibility.ex02;

public class AuthRequest {
    private String authType;
    private String username;
    private String password;
    private String apiKey;

    public AuthRequest() {
        super();
    }

    public AuthRequest(String authType) {
        this.authType = authType;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
