package com.codecool.bookshelf;

import java.util.*;
import java.util.stream.Collectors;

public class Bookshelf {

    List<Book> bookShelf = new ArrayList<>();


    public void addBook(Book book) {
        bookShelf.add(book);
    }

    public List<Book> getBooks(int year) {
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < bookShelf.size(); i++) {
            if (bookShelf.get(i).getReleaseYear() == year) {
                books.add(bookShelf.get(i));
            }
        }
        return books;

//        return bookShelf.stream().filter(item -> item.getReleaseYear() == year).collect(Collectors.toList());
    }

    public String getLightestAuthor() {
         return bookShelf.stream().min(Comparator.comparing(Book::getWeightInGram)).get().getAuthor();
    }

    public String getAuthorOfMostWrittenPages() {
        Set<String> authors;
        authors = bookShelf.stream().map(Book::getAuthor).collect(Collectors.toSet());
        Map<String, Integer> sumOfPages = new HashMap<String, Integer>();
        authors.stream().forEach(author -> sumOfPages.put(author, getSumOfPagesForAuthor(author)));

        return sumOfPages.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).orElseThrow(IllegalStateException::new).getKey();



//        return bookShelf.stream().max(Comparator.comparing(Book::getNumberOfPages)).get().getAuthor();

//        return bookShelf.stream().
//                reduce((book1, book2) -> book1.getNumberOfPages() > book2.getNumberOfPages() ? book1 : book2)
//                .stream()
//                .findAny()
//                .get().getAuthor();
    }


    private int getSumOfPagesForAuthor(String author) {
        return bookShelf.stream().filter(book -> book.getAuthor().equals(author)).mapToInt(Book::getNumberOfPages).sum();
    }

    /*
    Legyen egy getBooks() függvénye, aminek legyen egy year paramétere. Azon könyveket adja vissza egy listában, amik a year évében lettek kiadva.
     */

    /*
    Legyen egy getLightestAuthor() függvénye, ami visszaadja annak a szerzőnek a nevét, aki a legkönnyebb könyvet írta.
     */

    /*
    Legyen egy getAuthorOfMostWrittenPages() metódusa, ami visszadja annak a szerzőnek a nevét, aki a legtöbb oldalt írta.
     */

    /*
    Legyen egy printBooks() függvénye, ami kiírja az összes könyv adatát. Soronként kiírja a könyvek getBookInfo() visszatérési értékét. Figyelj a bemeneti paraméter validálására is!
     */


}
