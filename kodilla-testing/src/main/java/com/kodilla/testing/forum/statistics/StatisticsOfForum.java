package com.kodilla.testing.forum.statistics;

public class StatisticsOfForum {
    private int numbersOfUsers = 0;
    private int numberOfPosts = 0;
    private int numberOfComments = 0;
    private double averageOfPostsOnUser = 0.0;
    private double averageOfCommentsOnUser = 0.0;
    private double averageOfCommentsOnPost = 0.0;

    public int getNumbersOfUsers() {
        return numbersOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageOfPostsOnUser() {
        return averageOfPostsOnUser;
    }

    public double getAverageOfCommentsOnUser() {
        return averageOfCommentsOnUser;
    }

    public double getAverageOfCommentsOnPost() {
        return averageOfCommentsOnPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numbersOfUsers = statistics.userNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if (numbersOfUsers != 0) {
            averageOfPostsOnUser = numberOfPosts / numbersOfUsers;
        }
        if (numbersOfUsers != 0) {
            averageOfCommentsOnUser = numberOfComments / numbersOfUsers;
        }
        if (numberOfPosts != 0) {
            averageOfCommentsOnPost = numberOfComments / numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println(numbersOfUsers);
        System.out.println(numberOfComments);
        System.out.println(numberOfComments);
        System.out.println(averageOfPostsOnUser);
        System.out.println(averageOfCommentsOnUser);
        System.out.println(averageOfCommentsOnPost);
    }
}

class Application {
    public static void main(String[] args) {
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum();
        statisticsOfForum.showStatistics();
    }
}








