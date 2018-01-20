package com.oputyk.librarywebapp.Book;

import com.oputyk.librarywebapp.Book.domain.BookFacade;
import com.oputyk.librarywebapp.Book.dto.BookMaxInfoDto;
import com.oputyk.librarywebapp.Book.dto.BookMinInfoDto;
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
    private BookFacade bookFacade;

    @RequestMapping("all-min-info")
    public List<BookMinInfoDto> getAllBooksMinInfo() {
        return bookFacade.findAllBooksMinInfo();
    }

    @RequestMapping("all-max-info")
    public List<BookMaxInfoDto> getAllBooksMaxInfo() {
        return bookFacade.findAllBooksMaxInfo();
    }

    @RequestMapping(value = "update-max-info", method = RequestMethod.POST)
    public BookMaxInfoDto editBook(@RequestBody BookMaxInfoDto bookMaxInfoDto) {
        return bookMaxInfoDto;
    }

    @RequestMapping(value = "update-min-info", method = RequestMethod.POST)
    public BookMinInfoDto editBook(@RequestBody BookMinInfoDto bookMinInfoDto) {
        return bookMinInfoDto;
    }

}
