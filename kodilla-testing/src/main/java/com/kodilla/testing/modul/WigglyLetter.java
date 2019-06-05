package com.kodilla.testing.modul;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;

public class WigglyLetter {

    private ArrayList<String> evenList = new ArrayList<>();
    private ArrayList<String> oddList = new ArrayList<>();

    public ArrayDeque<String> generateA(){

        ArrayDeque<String> listOfA = new ArrayDeque<>();
        Random theGenerator = new Random();

        for (int i = 0; i < 50; i++) {
            int randomA = theGenerator.nextInt(51);
            String numberA = "a";
            for (int j = 0; j < randomA; j++) {
                numberA += "a";
            }
            listOfA.add(numberA);
        }
        return listOfA;
    }

    public void divider(ArrayDeque<String> listDivider){

        for (String numbers: listDivider) {
            if (numbers.length() % 2 == 0){
                evenList.add(numbers);
        } else {
                oddList.add(numbers);
            }
        }
    }

    public ArrayList<String> getEvenList() {
        return evenList;
    }

    public ArrayList<String> getOddList() {
        return oddList;
    }

    public static void main(String[] args) {

        WigglyLetter wigglyLetter = new WigglyLetter();
        ArrayDeque<String> strings = wigglyLetter.generateA();
        wigglyLetter.divider(strings);
        System.out.println();
        System.out.println();
        System.out.println(strings);
        System.out.println();
        System.out.println();
        System.out.println(wigglyLetter.getEvenList());
        System.out.println();
        System.out.println();
        System.out.println(wigglyLetter.getOddList());


    }
}


