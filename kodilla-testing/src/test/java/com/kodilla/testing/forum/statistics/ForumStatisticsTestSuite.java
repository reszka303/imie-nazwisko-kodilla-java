package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

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
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum();
        statisticsOfForum.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(1000, statisticsOfForum.getNumberOfPosts());
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

    @Test public void  testWhileCommentsAreLessFromPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfComments = 0;
        int numberOfPosts = 1;
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum();
        statisticsOfForum.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0,statisticsOfForum.getNumberOfComments());
        Assert.assertEquals(1,statisticsOfForum.getNumberOfPosts());
    }

    @Test
    public void testWhileCommentsAreMoreFromPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        int numberOfComments = 1;
        int numberOfPosts = 0;
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum();
        statisticsOfForum.calculateAdvStatistics(statisticsMock);


        Assert.assertEquals(1, statisticsOfForum.getNumberOfComments());
        Assert.assertEquals(0,statisticsOfForum.getNumberOfPosts());
    }

    @Test
    public void testNumberOfUsersEqualZero() {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> numbersOfUsers = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(numbersOfUsers);
        StatisticsOfForum statisticsOfForum = new StatisticsOfForum();
        statisticsOfForum.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, numbersOfUsers.size());
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

        Assert.assertEquals(100, numberOfUsers.size());
    }
}
