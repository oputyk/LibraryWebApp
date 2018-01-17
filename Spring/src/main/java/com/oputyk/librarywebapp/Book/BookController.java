package com.oputyk.librarywebapp.Book;

import com.oputyk.librarywebapp.Book.domain.BookFacade;
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
@RequestMapping("api/book/")
public class BookController {
    @Autowired
    BookFacade bookFacade;

    @RequestMapping("all-books")
    public List<BookDto> getAllBooks() {

    }

    @RequestMapping(value = "edit-book", method = RequestMethod.POST)
    public BookDto editBook(@RequestBody BookDto bookDto) {
        return bookDto;
    }
}
