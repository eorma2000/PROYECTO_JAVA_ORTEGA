package com.example.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.library.model.Book;
import com.example.library.repository.IBookRepository;

@Service
public class BookService 
{

    private final IBookRepository bookRepository;

    public BookService(IBookRepository bookRepository) 
    {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll() 
    {
        return bookRepository.getAll();
    }

    public Book get(String id) 
    {
        return bookRepository.get(id);
    }

    public Book addBook(Book book) 
    {
        book.setId(null);
        return bookRepository.save(book);
    }

    public Book updatebook(String id, Book book) 
    {
        Book bookR = bookRepository.get(id);
        if (bookR == null) {
            return null;
        }
        book.setId(id);
        return bookRepository.save(book);
    }

    public Book deleteBook(String id) 
    {
        return bookRepository.delete(id);

    }
}
