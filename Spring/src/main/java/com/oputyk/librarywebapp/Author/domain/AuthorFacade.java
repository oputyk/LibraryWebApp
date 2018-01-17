package com.oputyk.librarywebapp.Author.domain;

import com.oputyk.librarywebapp.Author.dto.AuthorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by kamil on 15/01/2018.
 */
@Transactional
@Component
public class AuthorFacade {
    @Autowired
    private AuthorRepository authorRepository;

    public List<AuthorDto> findAllAuthorDtos() {
        return authorEntityDtoConverter.toAuthorDto(authorRepository.findAll());
    }
}
