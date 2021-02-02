package com.codecool.bookshelf;

public class PaperbackBook extends Book {

    private static final int ONEPAGEINGRAM = 10;
    private static final int CASEINGRAM = 20;

    public PaperbackBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages, numberOfPages * ONEPAGEINGRAM + CASEINGRAM);
    }
}
