package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Prepare to execute test #" + testCounter);
    }

    @Test
    public void testNumberOfPostsEqualZero() {
       Statistics statisticsMock = mock(Statistics.class);
       int numberOfPosts = 0;
       when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
       StatisticsOfForum statisticsOfForum = new StatisticsOfForum();
       statisticsOfForum.calculateAdvStatistics(statisticsMock);

       Assert.assertEquals(0,statisticsOfForum.getNumberOfPosts());
    }

    @Test
    public void testNumberOfPostsEqualOneHundred() {
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfPosts = 1000;
        int numberOfComments = 2000;
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum();
        statisticsOfForum.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(1000, statisticsOfForum.getNumberOfPosts());
        Assert.assertEquals(2.0,statisticsOfForum.getAverageOfCommentsOnPost(),0.01);
    }

    @Test
    public void testNumberOfCommentsEqualZero() {
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfComments = 0;
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum();
        statisticsOfForum.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0,statisticsOfForum.getNumberOfComments());
    }

    @Test
    public void  testWhileCommentsAreLessFromPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfComments = 50;
        int numberOfPosts = 100;
        ArrayList<String> numbersOfUsers = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            numbersOfUsers.add("");
        }

        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.userNames()).thenReturn(numbersOfUsers);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum();
        statisticsOfForum.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(50,statisticsOfForum.getNumberOfComments());
        Assert.assertEquals(100,statisticsOfForum.getNumberOfPosts());
        Assert.assertEquals(20,statisticsOfForum.getNumbersOfUsers());
        Assert.assertEquals(5.0,statisticsOfForum.getAverageOfPostsOnUser(),0.01);
    }

    @Test
    public void testWhileCommentsAreMoreFromPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfComments = 250;
        int numberOfPosts = 150;
        List<String> numbersOfUsers = new ArrayList<>();
        for (int i = 0; i < 49 ; i++) {
            numbersOfUsers.add("");
        }
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.userNames()).thenReturn(numbersOfUsers);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum();
        statisticsOfForum.calculateAdvStatistics(statisticsMock);


        Assert.assertEquals(250, statisticsOfForum.getNumberOfComments());
        Assert.assertEquals(150, statisticsOfForum.getNumberOfPosts());
        Assert.assertEquals(49, statisticsOfForum.getNumbersOfUsers());
        Assert.assertEquals(5.0, statisticsOfForum.getAverageOfCommentsOnUser(),0.01);
    }

    @Test
    public void testNumberOfUsersEqualZero() {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> numbersOfUsers = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(numbersOfUsers);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum();
        statisticsOfForum.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, statisticsOfForum.getNumbersOfUsers());
    }

    @Test
    public void testNumberOfUsersEqualOneHundred() {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> numberOfUsers = new ArrayList<>();

        for (int i = 0; i < 100 ; i++) {
            numberOfUsers.add("");
        }
        when(statisticsMock.userNames()).thenReturn(numberOfUsers);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum();
        statisticsOfForum.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(100, statisticsOfForum.getNumbersOfUsers());
    }
}
