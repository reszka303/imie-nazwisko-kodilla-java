package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        //tu umieśc kolejny test ->

        System.out.println("Test - pierwszy test jednostkowy");

        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();

        int result1 = calculator1.add(100,300);

        int result2 = calculator2.substract(250, 350);

        System.out.println("Result of add is: " + result1);
        System.out.println("Result of substract is: " + result2);


    }
}
