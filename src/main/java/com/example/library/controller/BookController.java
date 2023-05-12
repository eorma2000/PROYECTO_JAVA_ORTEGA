package com.example.library.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Book;
import com.example.library.service.BookService;

@RestController
@RequestMapping({ "/book" })
public class BookController 
{
    private final BookService bookService;

    public BookController(BookService bookService) 
    {
        this.bookService = bookService;
    }

    @GetMapping("")
    public List<Book> getAll() 
    {
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book get(@PathVariable String id) 
    {
        return bookService.get(id);
    }

    @PostMapping("")
    public Book addBook(@RequestBody Book book) 
    {
        return bookService.addBook(book);
    }

    @PutMapping("/{id}")
    public Book addBook(@PathVariable String id, @RequestBody Book book) 
    {
        return bookService.updatebook(id, book);
    }

    @DeleteMapping("/{id}")
    public Book addBook(@PathVariable String id) 
    {
        return bookService.deleteBook(id);
    }
}
