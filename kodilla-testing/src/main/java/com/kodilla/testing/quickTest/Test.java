package com.kodilla.testing.quickTest;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        double number;

        Random rnd = new Random();

        number = rnd.nextDouble();
        System.out.println(number);

    }
}
