package com.kodilla.testing.modul;

import java.util.*;

public class MeasurementOfSpeed {
    public static void main(String[] args) {
        //LinkedList
        LinkedList<Book> listLinked = new LinkedList<>();

        listLinked.add(new Book("Witold Gombrowicz","Ferdydurke"));
        listLinked.add(new Book("Zbigniew Herbert", "Pan Cogito"));
        listLinked.add(new Book("Stanisław Lem", "Solaris"));
        listLinked.add(new Book("Tadeusz Dołęga-Mostowicz ", "Kariera Nikodema Dyzmy"));
        listLinked.add(new Book("Sławomir Mrożek", "Tango"));
        listLinked.add(new Book("Melchior Wańkowicz", "Bitwa o Monte Cassino"));
        listLinked.add(new Book("Stefan Żeromski", "Przedwiośnie"));
        listLinked.add(new Book("Julian Tuwim", "Sokrates tańczący"));

        System.out.println("LinkedList");
        //Application times a searching first index in ListLinked
        long searchingOfFirstIndexBegin = System.nanoTime();
        listLinked.get(0);
        long searchingOfFirstIndexEnd = System.nanoTime();
        System.out.println("Searching of first element of LinkedList has taken: " + (searchingOfFirstIndexEnd - searchingOfFirstIndexBegin) + " ms");


        //Application removes a first index in ListLinked
        long removingOfFirstIndexBegin = System.nanoTime();
        listLinked.removeFirst();
        long removingOfFirstIndexEnd = System.nanoTime();
        System.out.println("Removing of first element to LinkedList has taken: " + (removingOfFirstIndexEnd - removingOfFirstIndexBegin) + " ms");

        //Application searches a last index in ListLinked
        long searchingOfLastIndexBegin = System.nanoTime();
        listLinked.getLast();
        long searchingOfLastIndexEnd = System.nanoTime();
        System.out.println("Searching of last element of LinkedList has taken: " + (searchingOfLastIndexEnd - searchingOfLastIndexBegin) + " ms");

        //Application removes a last index in ListLinked
        long removingOfLastIndexBegin = System.nanoTime();
        listLinked.removeLast();
        long removingOfLastIndexEnd = System.nanoTime();
        System.out.println("Removing of last element to LinkedList has taken: " + (removingOfLastIndexEnd - removingOfLastIndexBegin) + " ms" );


        //Application adds a few thousands objects on the beginning of ListLinked

        for (int i = 0; i < 300000 ; i++) {
            listLinked.addFirst(new Book("" + i,"" + i));
        }
        long addLinkedListBeginningBegin = System.nanoTime();
        listLinked.addFirst(new Book("" + 300000,"" + 300000));
        long addLinkedListBeginningEnding = System.nanoTime();

        System.out.println("Addition of new elements on the beginning of LinkedList has taken: " + (addLinkedListBeginningEnding - addLinkedListBeginningBegin) + " ms");

        //Application adds a few thousands objects on the end of ListLinked
        for (int i = 0; i < 300000 ; i++) {
            listLinked.add(new Book("" + i,"" + i));
        }
        long addLinkedListEndingBegin = System.nanoTime();
        listLinked.add(new Book("" + 300000,"" + 300000));
        long addLinkedListEndingEnding = System.nanoTime();
        System.out.println("Addition of new elements on the end of LinkedList has taken: " + (addLinkedListEndingEnding - addLinkedListEndingBegin) + " ms");
        
        System.out.println("___________________________________________________________________________________");

        //HashMap
        System.out.println("HashMap");

        HashMap<String, Book> listHashMap = new HashMap<>();
        //Application times a searching after key of HashMap
        //I create a HashMap with 1 objects.
        for (int i = 0; i < 300000 ; i++) {
            listHashMap.put("" + i, new Book("" + i,"" + i));
        }
        //I time after key the HashMap
        long searchingOfFirstIndexBeginHashMap = System.nanoTime();
        listHashMap.get("" + 50000);
        long searchingOfFirstIndexEndHashMap = System.nanoTime();
        System.out.println("Searching after key of HashMap has taken: " + (searchingOfFirstIndexEndHashMap - searchingOfFirstIndexBeginHashMap) + " ms");

        //Application times a removing a HashMap
        long removingObjectsHashMapBegin = System.nanoTime();
        listHashMap.remove(+ 50000);
        long removingObjectsHashMapEnding = System.nanoTime();
        System.out.println("Removing all objects of HashMap has taken: " + (removingObjectsHashMapEnding - removingObjectsHashMapBegin) + " ms");
    }
}

class Book {
    private String author;
    private String title;
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }
}









