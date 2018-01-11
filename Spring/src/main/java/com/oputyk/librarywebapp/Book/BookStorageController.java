package com.oputyk.librarywebapp.Book;

import com.oputyk.librarywebapp.Book.dto.BookDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public List<BookDto> getAllBooks() {
        List<BookDto> bookDtos = new ArrayList<>();
        bookDtos.add(new BookDto(0, "Złodziejka książek", "Markus Zusak", 2));
        bookDtos.add(new BookDto(1, "Harry Potter Czara Ognia", "J. K. Rowling", 1));
        bookDtos.add(new BookDto(2, "Harry Potter Więzień Azkabanu", "J. K. Rowling", 4));
        bookDtos.add(new BookDto(3, "Harry Potter Książe Półkrwi", "J. K. Rowling", 3));

        return bookDtos;
    }

    @RequestMapping(value = "/book-storage/edit-book", method = RequestMethod.POST)
    public BookDto editBook(@RequestBody BookDto bookDto) {
        return bookDto;
    }
}
