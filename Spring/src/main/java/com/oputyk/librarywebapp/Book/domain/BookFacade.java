package com.oputyk.librarywebapp.Book.domain;

import com.oputyk.librarywebapp.Book.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by kamil on 14/01/2018.
 */
@Transactional
@Component
public class BookFacade {
    @Autowired
    BookRepository bookRepository;

    public List<BookDto> findAllBookDtos() {

    }
}
