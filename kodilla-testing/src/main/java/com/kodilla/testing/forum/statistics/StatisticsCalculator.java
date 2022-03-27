package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    double numberOfUsers;
    double numberOfPosts;
    double numberOfComments;
    double averageNumberOfUserPosts;
    double averageNumberOfUserComments;
    double averageNumberOfCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers != 0){
        averageNumberOfUserPosts = numberOfPosts / numberOfUsers;
        }
        else {
            averageNumberOfUserPosts = 0;
        }

        if (numberOfUsers != 0) {
        averageNumberOfUserComments = numberOfComments / numberOfUsers;
        }
        else {
            averageNumberOfUserComments = 0;
        }

        if (numberOfPosts != 0) {
            averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;
        }
        else {
            averageNumberOfCommentsPerPost = 0;
        }
    }


    public double getNumberOfUsers() {
        return numberOfUsers;
    }

    public double getNumberOfPosts() {
        return numberOfPosts;
    }

    public double getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfUserPosts() {
        return averageNumberOfUserPosts;
    }

    public double getAverageNumberOfUserComments() {
        return averageNumberOfUserComments;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }


    public void showStatistics() {
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average number of posts per user: " + averageNumberOfUserComments);
        System.out.println("Average number of comments per user: " + averageNumberOfUserComments);
        System.out.println("Average number of comments per post: " + averageNumberOfCommentsPerPost);

    }
}


