package com.oputyk.librarywebapp.Book.dto;

import com.oputyk.librarywebapp.Author.domain.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by kamil on 26/01/2018.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookListDto {
    private String bookName;
    private List<Author> authors;
    private Long count;
}
