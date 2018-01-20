package com.oputyk.librarywebapp.Author.domain;

import com.oputyk.librarywebapp.Author.dto.AuthorMaxInfoDto;
import com.oputyk.librarywebapp.Author.dto.AuthorMinInfoDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by kamil on 15/01/2018.
 */
@Transactional
@Component
public class AuthorFacade {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public List<AuthorMaxInfoDto> findAllMaxInfo() {
        return authorRepository.findAll().stream().map(author -> modelMapper.map(author, AuthorMaxInfoDto.class)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<AuthorMinInfoDto> findAllMinInfo() {
        return authorRepository.findAll().stream().map(author -> modelMapper.map(author, AuthorMinInfoDto.class)).collect(Collectors.toList());
    }

    public AuthorMaxInfoDto updateAuthorMaxInfo(AuthorMaxInfoDto authorMaxInfoDto) {
        Author author = authorRepository.findAuthorById(authorMaxInfoDto.getId());
        author = authorMaxInfoDto.updateEntity(author);
        return authorMaxInfoDto;
    }
}
