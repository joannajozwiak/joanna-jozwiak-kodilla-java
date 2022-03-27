package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class StatisticsCalculatorTest {
    private static int testCounter =0;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Mock
    private Statistics statisticsMock;

    @Test
    void testWhenNumberOfPostsIs0() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<String> resultUserNames = generateListOfNUserNames(5);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(resultUserNames);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0.0, statisticsCalculator.averageNumberOfUserPosts);
        assertEquals(2.0, statisticsCalculator.averageNumberOfUserComments);
        assertEquals(0.0, statisticsCalculator.averageNumberOfCommentsPerPost);

    }

    @Test
    void testWhenNumberOfPostsIs1000() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<String> resultUserNames = generateListOfNUserNames(100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(3500);
        when(statisticsMock.usersNames()).thenReturn(resultUserNames);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, statisticsCalculator.averageNumberOfUserPosts);
        assertEquals(35, statisticsCalculator.averageNumberOfUserComments);
        assertEquals(3.5, statisticsCalculator.averageNumberOfCommentsPerPost);

    }

    @Test
    void testWhenNumberOfCommentsIs0() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<String> resultUserNames = generateListOfNUserNames(100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(resultUserNames);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, statisticsCalculator.averageNumberOfUserPosts);
        assertEquals(0, statisticsCalculator.averageNumberOfUserComments);
        assertEquals(0, statisticsCalculator.averageNumberOfCommentsPerPost);

    }

    @Test
    void testWhenCommentsAreLessThanPosts() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<String> resultUserNames = generateListOfNUserNames(100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.usersNames()).thenReturn(resultUserNames);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, statisticsCalculator.averageNumberOfUserPosts);
        assertEquals(2, statisticsCalculator.averageNumberOfUserComments);
        assertEquals(0.2, statisticsCalculator.averageNumberOfCommentsPerPost);

    }

    @Test
    void testWhenCommentsAreMoreThanPosts() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<String> resultUserNames = generateListOfNUserNames(100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(3500);
        when(statisticsMock.usersNames()).thenReturn(resultUserNames);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, statisticsCalculator.averageNumberOfUserPosts);
        assertEquals(35, statisticsCalculator.averageNumberOfUserComments);
        assertEquals(3.5, statisticsCalculator.averageNumberOfCommentsPerPost);

    }

    @Test
    void testWhenNumberOfUsersIs0() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<String> resultUserNames = generateListOfNUserNames(0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(3500);
        when(statisticsMock.usersNames()).thenReturn(resultUserNames);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsCalculator.averageNumberOfUserPosts);
        assertEquals(0, statisticsCalculator.averageNumberOfUserComments);
        assertEquals(3.5, statisticsCalculator.averageNumberOfCommentsPerPost);

    }

    @Test
    void testWhenNumberOfUsersIs100() {

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<String> resultUserNames = generateListOfNUserNames(100);
        when(statisticsMock.postsCount()).thenReturn(12000);
        when(statisticsMock.commentsCount()).thenReturn(15000);
        when(statisticsMock.usersNames()).thenReturn(resultUserNames);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(120, statisticsCalculator.averageNumberOfUserPosts);
        assertEquals(150, statisticsCalculator.averageNumberOfUserComments);
        assertEquals(1.25, statisticsCalculator.averageNumberOfCommentsPerPost);

    }


    private List<String> generateListOfNUserNames(int i) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= i; n++) {
          String userName  = "Janek" + n;
            resultList.add(userName);
        }
        return resultList;
    }

}