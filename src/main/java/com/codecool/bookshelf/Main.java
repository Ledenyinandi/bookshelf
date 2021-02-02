package com.codecool.bookshelf;

public class Main {

    public static void main(String[] args) {
        HardcoverBook book = new HardcoverBook("x", "y", 1997, 100);
        HardcoverBook book2 = new HardcoverBook("x", "bb", 1997, 50);
        Bookshelf shelf = new Bookshelf();
        shelf.addBook(book);
        shelf.addBook(book2);


        System.out.println(shelf.getLightestAuthor());

    }
}
