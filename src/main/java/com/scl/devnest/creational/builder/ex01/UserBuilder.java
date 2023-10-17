package com.scl.devnest.creational.builder.ex01;

public class UserBuilder {
    private Long id;
    private String name;
    private String username;
    private String password;

    public UserBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public User build() {
        return new User(id, name, username, password);
    }
}
