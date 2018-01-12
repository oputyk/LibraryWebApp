package com.oputyk.librarywebapp.Book.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kamil on 11/01/2018.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BookEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String author;
    private Long count;
}
