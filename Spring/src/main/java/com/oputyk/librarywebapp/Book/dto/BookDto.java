package com.oputyk.librarywebapp.Book.dto;

import com.oputyk.librarywebapp.Author.domain.Author;
import com.oputyk.librarywebapp.Author.dto.AuthorDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by kamil on 16/01/2018.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BookDto {
    private Long id;
    private String name;
    private List<AuthorDto> authors;
}
