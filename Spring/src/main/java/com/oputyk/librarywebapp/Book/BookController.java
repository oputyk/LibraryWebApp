package com.oputyk.librarywebapp.Book;

import com.oputyk.librarywebapp.Book.domain.BookRepository;
import com.oputyk.librarywebapp.Book.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kamil on 01/01/2018.
 */
@RestController()
@RequestMapping("api")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/book-storage/all")
    public List<BookDto> getAllBooks() {
        return bookRepository.getAll();
    }

    @RequestMapping(value = "/book-storage/edit-book", method = RequestMethod.POST)
    public BookDto editBook(@RequestBody BookDto bookDto) {
        return bookDto;
    }
}
