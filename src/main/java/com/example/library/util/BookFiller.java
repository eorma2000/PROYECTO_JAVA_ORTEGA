package com.example.library.util;

import org.springframework.stereotype.Component;

import com.example.library.model.Book;
import com.example.library.service.BookService;

import javax.annotation.PostConstruct;

@Component
public class BookFiller {

    private final BookService bookService;

    public BookFiller(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct
    public void init() {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925,
                "A classic novel about the roaring twenties and the American Dream");
        bookService.addBook(book1);

        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960,
                "A powerful novel about racism, justice, and childhood in the South");
        bookService.addBook(book2);

        Book book3 = new Book("1984", "George Orwell", 1949,
                "A dystopian novel about a totalitarian government and the power of language");
        bookService.addBook(book3);
    }
}
