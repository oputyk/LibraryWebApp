package com.oputyk.librarywebapp.Author.dto;

import com.oputyk.librarywebapp.Author.domain.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by kamil on 15/01/2018.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AuthorMinInfoDto {
    private Long id;
    private String firstName;
    private String lastName;

    @Transactional
    public Author updateEntity(Author author) {
        author.setFirstName(firstName);
        author.setLastName(lastName);

        return author;
    }
}
