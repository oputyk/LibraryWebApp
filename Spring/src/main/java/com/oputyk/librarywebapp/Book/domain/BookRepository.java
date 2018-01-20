package com.oputyk.librarywebapp.Book.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by kamil on 11/01/2018.
 */
@Transactional
public interface BookRepository extends JpaRepository<Book, Long> {
    @Transactional(readOnly = true)
    List<Book> findAll();
    @Transactional(readOnly = true)
    Book findBookById(Long id);
}
