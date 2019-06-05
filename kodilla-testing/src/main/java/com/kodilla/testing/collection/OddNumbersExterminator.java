package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbersOddAndEven) {

        ArrayList<Integer> oddList = new ArrayList<>();

        for (int i = 0; i < numbersOddAndEven.size() ; i++) {

            if (numbersOddAndEven.get(i) % 2 == 0) {
                oddList.add(numbersOddAndEven.get(i));
            }
        }
            return oddList;
    }
}



