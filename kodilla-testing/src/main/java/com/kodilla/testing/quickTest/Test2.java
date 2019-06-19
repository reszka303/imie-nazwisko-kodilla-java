package com.kodilla.testing.quickTest;


import java.util.ArrayList;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> listTest2 = new ArrayList<>();
        Random theGenerator = new Random();
        listTest2.add("Edek");
        listTest2.add("Mietek");
        listTest2.add("Bożena");
        listTest2.add("Krystyna");
        listTest2.add("Grażyna");


    }
}

class UserName {
    private String name;

    @Override
    public String toString() {
        return "UserName{" +
                "name='" + name + '\'' +
                '}';
    }
}