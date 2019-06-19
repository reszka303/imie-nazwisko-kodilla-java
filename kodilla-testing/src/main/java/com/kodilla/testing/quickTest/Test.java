package com.kodilla.testing.quickTest;


import java.util.*;
import java.lang.*;


class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String toString() {
        return "Title: \"" + title + "\", author: " + author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean equals(Object o){
        Book e = (Book) o;
        return (author.equals(e.getAuthor())) &&
                (title.equals(e.getTitle()));
    }

}

class LinkedListBooksLibrary {

    private LinkedList<Book> theList;

    public LinkedListBooksLibrary(LinkedList<Book> newList) {
        this.theList = newList;

    }

    public void addBooksToLinkedList() {
        for(int n = 0; n < 100000; n++) {
            theList.add(new Book("Author nr " + n, "Title nr " + n));
        }
        System.out.println("Quantity of elements in the LinkedList the collection: " + theList.size());
        System.out.println();
    }

    public void linkedListProcessorInsertNext() {

        int n = theList.size();
        theList.addLast(new Book("Author nr " + n, "Title nr " + n));

        System.out.println("Quantity of elements in the LinkedList the collection: " + theList.size());
        System.out.println();
    }

    public void linkedListProcessorInsertLast(int n) {

        if( n > theList.size())
        {
            theList.addLast(new Book("Author nr " + n, "Title nr " + n));

            System.out.println("Quantity of elements in the LinkedList the collection: " + theList.size());
            System.out.println();
        }

    }

}

class LinkedListExample
{
    public static void main (String[] args) throws java.lang.Exception
    {
        LinkedList<Book> theList = new LinkedList<Book>();
        LinkedListBooksLibrary process = new LinkedListBooksLibrary(theList);
        process.addBooksToLinkedList();
        process.linkedListProcessorInsertNext();
        process.linkedListProcessorInsertLast(100002);
    }
}
