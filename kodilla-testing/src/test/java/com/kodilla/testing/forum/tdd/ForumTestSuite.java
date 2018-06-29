package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.forum.ForumComment;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning od tests");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest(){
        testCounter ++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test   //test 1
    public void testAddPost(){
                //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
                // When
        forumUser.addPost("mrsmith", "Hello everyone, this is my first contribution here!");
                //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test   //test 2
    public void testAddComment(){
                //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");

                //When
        forumUser.addComment(thePost, "mrsmith", "Thank you for all good words!");

                //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test   //test 3
    public void testGetPost(){
            //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

            //When
        ForumPost retrivedPost;
        retrivedPost = forumUser.getPost(0);

            //Then
        Assert.assertEquals(thePost, retrivedPost);
    }

    @Test   //test 4
    public void testGetComment(){
            //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

            //When
        ForumComment retrievedComment = forumUser.getComment(0);

            //then
        Assert.assertEquals(theComment, retrievedComment);
    }
    @Test   //Test 5
    public void testRemovePostNotExisting(){
            //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");

            //When
        boolean result = forumUser.removePost(thePost);

            //Then
        Assert.assertFalse(result);
    }

    @Test   //Test 7
    public void testRemovePost(){
            //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
            //When
        boolean result = forumUser.removePost(thePost);

            //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test   //Test 6
    public void testRemoveCommentNotExisting(){
            //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith",
                "Thank you for all good words!");

            //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertFalse(result);
    }

    @Test   //Test 8

    public void testRemoveComment(){
            //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

            //When
        boolean result = forumUser.removeComment(theComment);

            //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}
