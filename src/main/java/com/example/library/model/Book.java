package com.example.library.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Book {

    private String id;
    private String title;
    private String description;
    private String author;
    private int year;
    
    // constructor
    public Book(String title, String author, int year, String description) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.year = year;
    }

}
