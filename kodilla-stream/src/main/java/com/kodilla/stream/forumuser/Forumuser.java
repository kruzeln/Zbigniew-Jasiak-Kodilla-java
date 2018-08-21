package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class Forumuser {
    private int userID;
    private String userName;
    private char sex;
    private LocalDate dateOfBirth;
    private int numbOfPosts;

    public Forumuser(int userID, String userName, char sex,
                     LocalDate dateOfBirth, int numbOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numbOfPosts = numbOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumbOfPosts() {
        return numbOfPosts;
    }

    @Override
    public String toString() {
        return "Forumuser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numbOfPosts=" + numbOfPosts +
                '}';
    }
}
