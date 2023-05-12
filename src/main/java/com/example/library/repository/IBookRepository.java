package com.example.library.repository;

import java.util.List;

import com.example.library.model.Book;

public interface IBookRepository 

{
    
    public List<Book> getAll();

    public Book get(String id);

    public Book save(Book book);

    public Book delete(String id);

}
