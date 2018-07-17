package com.kodilla.testing.forum.statistics;

public class CountAllStatistics {
    private int numbOfUsers;
    private int numbOfPosts;
    private int numbOfComments;
    private double averageNumbOfPosts;
    private double averageNumbOfUserComments;
    private double averageNumbOfPostComments;

    public void calculateAdvStatistics(Statistics statistics) {
        // klasa oblicza 6 statystyk
        numbOfUsers = statistics.usersNames().size();
        numbOfPosts = statistics.postCount();
        numbOfComments = statistics.commentsCount();

        if (numbOfUsers > 0) {
            averageNumbOfPosts = (double) numbOfPosts / numbOfUsers;
        } else {
            averageNumbOfPosts = 0.0;
        }

        if (numbOfUsers > 0) {
            averageNumbOfUserComments = (double) numbOfComments / numbOfUsers;
        } else {
            averageNumbOfUserComments = 0.0;
        }

        if (numbOfPosts > 0) {
            averageNumbOfPostComments = (double) numbOfComments / numbOfPosts;
        } else {
            averageNumbOfPostComments = 0.0;
        }
    }

        public int getNumbOfUsers(){
            return numbOfUsers;
        }

        public int getNumbOfPosts(){
            return numbOfPosts;
        }

        public int getNumbOfComments(){
            return numbOfComments;
        }

        public double getAverageNumbOfPosta(){
                averageNumbOfPosts = numbOfPosts / numbOfComments;
            return averageNumbOfPosts;
        }

        public double getAverageNumbOfUserComments(){
                averageNumbOfUserComments = (double)numbOfComments / numbOfPosts;
                System.out.println(numbOfComments + ", " + numbOfPosts +", " + averageNumbOfUserComments);
            return averageNumbOfUserComments;
        }

        public double getAverageNumbOfPostComments(){
            return averageNumbOfPostComments;
        }


    public void showStatistics(){
        System.out.println("WYNIKI: ");
        //klasa wyświetla wyniki statystyk
    }
}
