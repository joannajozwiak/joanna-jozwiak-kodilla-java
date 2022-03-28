package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int numberID;
    private final String userName;
    private final char sex;
    private final LocalDate birthdayDate;
    private final int numberOfPosts;

    public int getNumberID() {
        return numberID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public ForumUser(final int numberID, final String userName, final char sex, final LocalDate birthdayDate, final int numberOfPosts) {
        this.numberID = numberID;
        this.userName = userName;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.numberOfPosts = numberOfPosts;

    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "numberID=" + numberID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
