package com.kodilla.good.patterns.challenges;

public class User {
    private String userName;
    private String userNick;

    public User(String userName, String userNick) {
        this.userName = userName;
        this.userNick = userNick;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserNick() {
        return userNick;
    }
}
