package com.codecool.bookshelf;

public class HardcoverBook extends Book {

    private static final int ONEPAGEINGRAM = 10;
    private static final int CASEINGRAM = 100;

    public HardcoverBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages, numberOfPages * ONEPAGEINGRAM + CASEINGRAM);
    }
}
