package com.oputyk.librarywebapp.Book;

import com.oputyk.librarywebapp.Book.domain.Book;
import com.oputyk.librarywebapp.Book.domain.BookFacade;
import com.oputyk.librarywebapp.Book.dto.BookMaxInfoDto;
import com.oputyk.librarywebapp.Book.dto.BookMinInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("{bookId}/max-info")
    public BookMaxInfoDto getBookMaxInfo(@PathVariable Long bookId) {
        return bookFacade.findBookMaxInfoById(bookId);
    }

    @RequestMapping(value = "update-max-info", method = RequestMethod.POST)
    public BookMaxInfoDto editBook(@RequestBody BookMaxInfoDto bookMaxInfoDto) {
        return bookFacade.updateBookMaxInfo(bookMaxInfoDto);
    }

    @PostMapping(value = "update-min-info")
    public BookMinInfoDto editBook(@RequestBody BookMinInfoDto bookMinInfoDto) {
        return bookMinInfoDto;
    }

    @PostMapping("add-max-info")
    public BookMaxInfoDto addBookMaxInfo(@RequestBody BookMaxInfoDto bookMaxInfoDto) {
        return bookFacade.addBookMaxInfo(bookMaxInfoDto);
    }

    @DeleteMapping("{bookId}")
    public Long deleteBook(@PathVariable Long bookId) {
        return bookFacade.deleteBookById(bookId);
    }

}
