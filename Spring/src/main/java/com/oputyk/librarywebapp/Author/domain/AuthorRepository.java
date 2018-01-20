package com.oputyk.librarywebapp.Author.domain;

import org.hibernate.annotations.Fetch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by kamil on 14/01/2018.
 */
@Transactional
public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Transactional(readOnly = true)
    List<Author> findAll();
    @Transactional(readOnly = true)
    Author findAuthorById(Long id);
}
