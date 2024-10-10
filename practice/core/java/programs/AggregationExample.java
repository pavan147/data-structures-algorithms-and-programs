package practice.core.java.programs;

import java.util.List;
import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    List<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        for (Book book : books) {
            book.displayInfo();
        }
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
    }
}
