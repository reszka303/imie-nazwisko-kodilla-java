package com.kodilla.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.kodilla.patterns2.adapter.bookclasifier.librarya.Book> booksA) {
        Map<BookSignature, com.kodilla.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> booksB = new HashMap<>();
        for (com.kodilla.kodilla.patterns2.adapter.bookclasifier.librarya.Book book : booksA) {
            booksB.put(new BookSignature(book.getSignature()),
                    new Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        return medianPublicationYear(booksB);
    }

    @Override
    public int averagePublicationYearClassifier(Set<com.kodilla.kodilla.patterns2.adapter.bookclasifier.librarya.Book> booksA) {
        Map<BookSignature, com.kodilla.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> booksB = new HashMap<>();
        for (com.kodilla.kodilla.patterns2.adapter.bookclasifier.librarya.Book book : booksA) {
            booksB.put(new BookSignature(book.getSignature()),
                    new Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        return averagePublicationYear(booksB);
    }
}
