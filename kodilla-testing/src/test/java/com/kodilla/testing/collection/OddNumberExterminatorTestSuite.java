package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class OddNumberExterminatorTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> emptyList = new ArrayList<>();

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = exterminator.exterminate(emptyList);

        Assert.assertEquals(0, result.size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> oddAndEvenList = new ArrayList<>();

        oddAndEvenList.add(1);
        oddAndEvenList.add(2);
        oddAndEvenList.add(3);
        oddAndEvenList.add(4);
        oddAndEvenList.add(5);

        ArrayList<Integer> evenList = new ArrayList<>();

        evenList.add(2);
        evenList.add(4);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = exterminator.exterminate(oddAndEvenList);

        Assert.assertEquals(evenList, result);

    }
}
