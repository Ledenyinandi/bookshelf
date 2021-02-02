package com.codecool.bookshelf;

public abstract class Book {

    private String title;
    private String author;
    private int releaseYear;
    private int numberOfPages;
    private int weightInGram;

    public Book(String title, String author, int releaseYear, int numberOfPages, int weightInGram) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.numberOfPages = numberOfPages;
        this.weightInGram = weightInGram;
    }

    public String getBookInfo() {
        return author + ": " + title + " (" + releaseYear + ")";
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getWeightInGram() {
        return weightInGram;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
