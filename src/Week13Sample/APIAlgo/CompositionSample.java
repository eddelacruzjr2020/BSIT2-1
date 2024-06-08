/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Sample.APIAlgo;

import java.util.*;

class Book {
    public String title;
    public String author;
    
        Book(String title, String author) {

        this.title = title;

        this.author = author;

        }

    }

    class Library {



    // reference to refer to list of books.
    private final List<Book> books;

        Library(List<Book> books) {

        this.books = books;

        }

        public List<Book> getTotalBooksInLibrary() {

        return books;

        }

        }

        public class CompositionSample {

        public static void main(String[] args) {



        Book b1 = new Book("Effective Java", "Joshua Bloch");

        Book b2 = new Book("Thinking in Java", "Bruce Eckel");

        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");



        List<Book> books = new ArrayList<Book>();

        books.add(b1);

        books.add(b2);

        books.add(b3);



        Library library = new Library(books);



        List<Book> bks = library.getTotalBooksInLibrary();

        for (Book bk : bks) {



        System.out.println("Title : " + bk.title + " and " + " Author : " + bk.author);

        }

    }
    
}
