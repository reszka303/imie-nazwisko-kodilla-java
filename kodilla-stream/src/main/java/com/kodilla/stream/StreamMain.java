package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier1 = new PoemBeautifier();
        PoemBeautifier poemBeautifier2 = new PoemBeautifier();
        PoemBeautifier poemBeautifier3 = new PoemBeautifier();
        PoemBeautifier poemBeautifier4 = new PoemBeautifier();
        String text = "This is a city";
        poemBeautifier1.beautify("Warsaw",(string -> text.toUpperCase()));
        poemBeautifier2.beautify("Berlin",(string -> text.toLowerCase()));
        poemBeautifier3.beautify("Paris",(string -> text.concat("is beautiful place")));
        poemBeautifier4.beautify("Madrid", string ->"<<<<<" + text +">>>>>");


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
