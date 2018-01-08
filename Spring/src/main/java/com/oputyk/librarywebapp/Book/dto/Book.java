package com.oputyk.librarywebapp.Book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by kamil on 08/01/2018.
 */

@AllArgsConstructor
@Data
public class Book {
    private int id;
    private String name;
    private String author;
    private int count;
}
