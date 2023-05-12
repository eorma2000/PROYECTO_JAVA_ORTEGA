package com.example.library.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.library.model.Book;

@Repository

public class MemoryBookRepository implements IBookRepository {

    private Map<String, Book> booksMap;

    MemoryBookRepository() 
    {
        booksMap = new HashMap<>();
    }

    @Override
    public List<Book> getAll() {
        List<Book> ret = new ArrayList<>();
        ret.addAll(booksMap.values());
        return ret;
    }

    @Override
    public Book get(String id) {
        return booksMap.get(id);
    }

    @Override
    public Book save(Book book) {
        if (book.getId() == null) {
            book.setId(String.valueOf(System.currentTimeMillis()));
        }
        return booksMap.put(book.getId(), book);
    }

    @Override
    public Book delete(String id) {
        return booksMap.remove(id);
    }

}
