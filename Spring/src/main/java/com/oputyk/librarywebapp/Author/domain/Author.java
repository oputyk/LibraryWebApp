package com.oputyk.librarywebapp.Author.domain;

import com.oputyk.librarywebapp.Book.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kamil on 14/01/2018.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    @ManyToMany
    @JoinTable(name = "author_book",
                joinColumns = @JoinColumn(name = "author_id"),
                inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Book> books;


}
