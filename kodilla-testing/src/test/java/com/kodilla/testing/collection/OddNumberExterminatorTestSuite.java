package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class OddNumberExterminatorTestSuite {

@Before
    public void before() {
    System.out.println("Test case: begin");
}

@After
    public void after() {
    System.out.println("Test case: end");
}

@BeforeClass
    public static void beforeClass(){
    System.out.println("Test suite: begin");
}
@AfterClass
    public static void afterClass() {
    System.out.println("Test suite: end");
}

@Test
    public void testOddNumbersExterminatorEmptyList(){

    ArrayList<Integer> emptyList = new ArrayList<>();
    OddNumbersExterminator exterminator = new OddNumbersExterminator();
    ArrayList<Integer> result = exterminator.exterminate(emptyList);

    Assert.assertEquals(0, result);
    }

@Test
    public void testOddNumbersExterminatorNormalList() {

    ArrayList<Integer> evenAndOddList = new ArrayList<>();

   evenAndOddList.add(1);
   evenAndOddList.add(2);
   evenAndOddList.add(3);
   evenAndOddList.add(4);
   evenAndOddList.add(5);

   ArrayList<Integer> evenList = new ArrayList<>();

   evenList.add(2);
   evenList.add(4);

   OddNumbersExterminator exterminator = new OddNumbersExterminator();
   ArrayList<Integer> result = exterminator.exterminate(evenAndOddList);

   Assert.assertEquals(evenList, result);



    }
}

