package com.oputyk.librarywebapp.Book.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.oputyk.librarywebapp.Author.domain.Author;
import com.oputyk.librarywebapp.Book.dto.BookMaxInfoDto;
import com.oputyk.librarywebapp.Book.dto.BookMinInfoDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collector;
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
    private Long isbn;
    private String name;
    @ManyToMany(mappedBy = "books", fetch = FetchType.LAZY, cascade =
            {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Author> authors;
}
