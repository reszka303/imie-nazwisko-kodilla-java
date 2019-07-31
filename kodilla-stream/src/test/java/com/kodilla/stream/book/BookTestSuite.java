package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor() {
        BookDirectory bookDirectory = new BookDirectory();

        List<Book> books = bookDirectory.getList();
        int numberOfBooksPublicatedAfter2007 = 0;
        for (Book book : books) {
            if(book.getYearOfPublication() > 2007) {
                numberOfBooksPublicatedAfter2007++;
            }
        }

        Assert.assertEquals(3,numberOfBooksPublicatedAfter2007);
    }

    @Test
    public void testGetListUsingIntStream() {
        BookDirectory bookDirectory = new BookDirectory();

        List<Book> books = bookDirectory.getList();

        int numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .map(n -> 1)
                .sum();
        Assert.assertEquals(3,numberOfBooksPublicatedAfter2007);

    }

    @Test
    public void testGetListUsingIntStreamLong() {
        BookDirectory bookDirectory = new BookDirectory();

        List<Book> books = new ArrayList<>();

        long numberOfBooksPublicatedAfter2007 = IntStream.range(0,books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .count();
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);

    }
}
