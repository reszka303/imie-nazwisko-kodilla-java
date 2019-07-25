package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uniqueIDOfForumUser;
    private final String nameOfForumUser;
    private final char sexOfUser;
    private final LocalDate dateOfBorn;
    private final int quantityOfPublishedPosts;

    public ForumUser(int uniqueIDOfForumUser, String nameOfForumUser, char sexOfUser, LocalDate dateOfBorn, int quantityOfPublishedPosts) {
        this.uniqueIDOfForumUser = uniqueIDOfForumUser;
        this.nameOfForumUser = nameOfForumUser;
        this.sexOfUser = sexOfUser;
        this.dateOfBorn = dateOfBorn;
        this.quantityOfPublishedPosts = quantityOfPublishedPosts;
    }

    public int getUniqueIDOfForumUser() {
        return uniqueIDOfForumUser;
    }

    public String getNameOfForumUser() {
        return nameOfForumUser;
    }

    public char getSexOfUser() {
        return sexOfUser;
    }

    public LocalDate getDateOfBorn() {
        return dateOfBorn;
    }

    public int getQuantityOfPublishedPosts() {
        return quantityOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueIDOfForumUser=" + uniqueIDOfForumUser +
                ", nameOfForumUser='" + nameOfForumUser + '\'' +
                ", sexOfUser=" + sexOfUser +
                ", dateOfBorn=" + dateOfBorn +
                ", quantityOfPublishedPosts=" + quantityOfPublishedPosts +
                '}';
    }
}
