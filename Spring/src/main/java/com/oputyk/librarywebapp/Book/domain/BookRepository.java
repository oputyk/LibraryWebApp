package com.oputyk.librarywebapp.Book.domain;

import com.oputyk.librarywebapp.Book.dto.BookDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by kamil on 11/01/2018.
 */
@Transactional
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllBooks();
    Book findBookById(Long id);
}
