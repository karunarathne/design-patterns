package com.scl.devnest.creational.builder.ex02;

public class BuilderEx02Application {
    public static void main(String[] args) {
        User user = User.builder()
                .setId(2L)
                .setName("PGK")
                .setUsername("pgk123")
                .setPassword("admin321")
                .build();

        System.out.println("User: " + user.getName());
    }
}
