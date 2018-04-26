package com.oputyk.librarywebapp.Book.domain;

import com.oputyk.librarywebapp.Author.domain.Author;
import com.oputyk.librarywebapp.Author.domain.AuthorRepository;
import com.oputyk.librarywebapp.Author.dto.AuthorMinInfoDto;
import com.oputyk.librarywebapp.Book.dto.BookListDto;
import com.oputyk.librarywebapp.Book.dto.BookMaxInfoDto;
import com.oputyk.librarywebapp.Book.dto.BookMinInfoDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kamil on 14/01/2018.
 */

@Component
public class BookFacade {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public BookFacade(BookRepository bookRepository,
                      AuthorRepository authorRepository,
                      ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional(readOnly = true)
    public List<BookMinInfoDto> findAllBooksMinInfo() {
        return bookRepository.findAll().stream()
                .map(book -> modelMapper.map(book, BookMinInfoDto.class))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public BookMaxInfoDto findBookMaxInfoById(Long bookId) {
        return modelMapper.map(bookRepository.findBookById(bookId), BookMaxInfoDto.class);
    }

    @Transactional(readOnly = true)
    public List<BookMaxInfoDto> findAllBooksMaxInfo() {
        return bookRepository.findAll().stream()
                .map(book -> modelMapper.map(book, BookMaxInfoDto.class))
                .collect(Collectors.toList());
    }

    @Transactional
    public BookMinInfoDto updateBookMinInfo(BookMinInfoDto bookMinInfoDto) {
        Book book = bookRepository.findBookById(bookMinInfoDto.getId());
        book = bookMinInfoDto.updateEntity(book);

        return bookMinInfoDto;
    }

    @Transactional
    public BookMaxInfoDto updateBookMaxInfo(BookMaxInfoDto bookMaxInfoDto) {
        Book book = bookRepository.findBookById(bookMaxInfoDto.getId());
        changeBookMinInfoAuthors(book, bookMaxInfoDto.getAuthors());
        book = bookMaxInfoDto.updateEntity(book);

        return bookMaxInfoDto;
    }

    @Transactional
    public BookMaxInfoDto addBookMaxInfo(BookMaxInfoDto bookMaxInfoDto) {
        Book book = modelMapper.map(bookMaxInfoDto, Book.class);
        changeBookMinInfoAuthors(book, bookMaxInfoDto.getAuthors());
        bookRepository.save(book);
        bookMaxInfoDto.setId(bookRepository.findTheLastBookId());

        return bookMaxInfoDto;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    protected void changeBookMinInfoAuthors(Book book, List<AuthorMinInfoDto> authorMinInfoDtos) {
        if(book.getAuthors() != null) {
            book.getAuthors().forEach(author -> {
                if(author.getBooks() != null) {
                    author.getBooks().remove(book);
                }
            });
        }

        List<Author> authors = authorMinInfoDtos.stream()
                .map(author-> authorRepository.findAuthorById(author.getId()))
                .collect(Collectors.toList());

        authors.forEach(author -> author.getBooks().add(book));
        book.setAuthors(authors);
    }

    @Transactional
    public Long deleteBookById(Long bookId) {
        Book book = bookRepository.findBookById(bookId);
        book.getAuthors().forEach(author -> author.getBooks().remove(book));
        bookRepository.deleteBookById(bookId);

        return bookId;
    }
}
