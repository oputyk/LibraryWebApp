package com.oputyk.librarywebapp.Book.domain;

import com.oputyk.librarywebapp.Book.dto.BookDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by kamil on 11/01/2018.
 */
public interface BookRepository extends JpaRepository<BookEntity, Long> {
    @Query("SELECT new com.oputyk.librarywebapp.Book.dto.BookDto (book.id, book.name, book.author, book.count) FROM BookEntity book")
    List<BookDto> getAll();


}
