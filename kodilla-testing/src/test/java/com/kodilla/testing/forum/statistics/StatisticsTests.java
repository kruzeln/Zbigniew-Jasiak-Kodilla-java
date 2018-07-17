package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticsTests {
    //sprawdza metodę calculateAdvStatistics(Statistics statistics) testowanej klasy
    public double delta = 0.001;

    @Test
    public void testNoPost(){
        //G
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postCount()).thenReturn(0);
        CountAllStatistics calculator = new CountAllStatistics();
        calculator.calculateAdvStatistics(statisticsMock);

        //W
        int postCount = calculator.getNumbOfPosts();
        //T
        Assert.assertEquals(0, postCount);
    }

    @Test
    public void testThousendPosts(){
        //G
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postCount()).thenReturn(1000);
        CountAllStatistics calculator = new CountAllStatistics();
        calculator.calculateAdvStatistics(statisticsMock);

        //W
        int postCount = calculator.getNumbOfPosts();

        //T
        Assert.assertEquals(1000, postCount);
    }

    @Test
    public void testNoComments() {
        //G
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        CountAllStatistics calculator = new CountAllStatistics();
        calculator.calculateAdvStatistics(statisticsMock);

        //W
        int commentsCount = calculator.getNumbOfComments();

        //T
        Assert.assertEquals(0, commentsCount);
    }

    @Test
     public void testLessCommentsThenPosts() {
        //G
         Statistics statisticsMock = mock(Statistics.class);
         when(statisticsMock.commentsCount()).thenReturn (200);
         when(statisticsMock.postCount()).thenReturn (1000);
         CountAllStatistics calculator = new CountAllStatistics();
         calculator.calculateAdvStatistics(statisticsMock);

         //W
          double commentVersusPost = calculator.getAverageNumbOfUserComments();

        //T
        Assert.assertEquals(0.2, commentVersusPost, delta);
    }

    @Test
    public void testMoreCommentsThenPosts(){
        //G
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postCount()).thenReturn(200);
        CountAllStatistics calculator = new CountAllStatistics();
        calculator.calculateAdvStatistics(statisticsMock);

        //W
        double commentsVersusPost2 = calculator.getAverageNumbOfUserComments();

        //T
        Assert.assertEquals(5, commentsVersusPost2, delta);

    }

    @Test
    public void testNoUsers(){
        //G
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        if (users.size() == 0){
            when(statisticsMock.usersNames()).thenReturn(users);
        }
        CountAllStatistics calculator = new CountAllStatistics();
        calculator.calculateAdvStatistics(statisticsMock);

        //W
        int usersNumber = calculator.getNumbOfUsers();

        //T
        Assert.assertEquals(0, usersNumber);
    }

    @Test
    public void testHundredUsers(){
        //G
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        for(int i=1; i<=100; i++){
            users.add("New user");
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        CountAllStatistics calculator = new CountAllStatistics();
        calculator.calculateAdvStatistics(statisticsMock);
        //W
        int usersNumber = calculator.getNumbOfUsers();

        //T
        Assert.assertEquals(100, usersNumber);
    }

}


