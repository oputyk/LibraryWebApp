package com.oputyk.librarywebapp.Book;

import com.oputyk.librarywebapp.Book.dto.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kamil on 01/01/2018.
 */
@RestController()
@RequestMapping("api")
public class BookStorageController {

    @RequestMapping("/book-storage")
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(0, "Złodziejka książek", "Markus Zusak", 2));
        books.add(new Book(1, "Harry Potter Czara Ognia", "J. K. Rowling", 1));
        books.add(new Book(2, "Harry Potter Więzień Azkabanu", "J. K. Rowling", 4));

        return books;
    }
}
