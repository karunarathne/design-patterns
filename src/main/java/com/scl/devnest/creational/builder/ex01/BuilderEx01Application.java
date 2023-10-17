package com.scl.devnest.creational.builder.ex01;

public class BuilderEx01Application {
    public static void main(String[] args) {
        UserBuilder builder = new UserBuilder();

        User user = builder.setId(1L)
                .setName("SBK")
                .setUsername("sbk123")
                .setPassword("admin123")
                .build();

        System.out.println("User: " + user.getName());
    }
}
