package com.oputyk.librarywebapp.Book.domain;

import com.oputyk.librarywebapp.Author.domain.Author;
import com.oputyk.librarywebapp.Book.dto.BookDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kamil on 11/01/2018.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private List<Author> authors;

    public BookDto dto() {
        return BookDto.builder()
                .id(id)
                .name(name)
                .authors(authors.stream().map(Author::dto).collect(Collectors.toList()))
                .build();
    }
}
