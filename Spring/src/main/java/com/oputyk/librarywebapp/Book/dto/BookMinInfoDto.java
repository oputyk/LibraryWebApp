package com.oputyk.librarywebapp.Book.dto;

import com.oputyk.librarywebapp.Author.dto.AuthorMaxInfoDto;
import com.oputyk.librarywebapp.Author.dto.AuthorMinInfoDto;
import com.oputyk.librarywebapp.Book.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by kamil on 16/01/2018.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BookMinInfoDto {
    private Long id;
    private String name;
    private List<AuthorMinInfoDto> authors;

    @Transactional
    public Book updateEntity(Book book) {
        book.setName(name);

        return book;
    }
}
