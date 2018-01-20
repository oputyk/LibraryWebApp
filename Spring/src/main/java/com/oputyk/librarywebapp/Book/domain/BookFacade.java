package com.oputyk.librarywebapp.Book.domain;

import com.oputyk.librarywebapp.Author.domain.Author;
import com.oputyk.librarywebapp.Book.dto.BookMaxInfoDto;
import com.oputyk.librarywebapp.Book.dto.BookMinInfoDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kamil on 14/01/2018.
 */
@Transactional
@Component
public class BookFacade {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public List<BookMinInfoDto> findAllBooksMinInfo() {
        return bookRepository.findAll().stream().map(book -> modelMapper.map(book, BookMinInfoDto.class)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<BookMaxInfoDto> findAllBooksMaxInfo() {
        return bookRepository.findAll().stream().map(book -> modelMapper.map(book, BookMaxInfoDto.class)).collect(Collectors.toList());
    }

    public BookMinInfoDto updateBookMinInfo(BookMinInfoDto bookMinInfoDto) {
        Book book = bookRepository.findBookById(bookMinInfoDto.getId());
        book = bookMinInfoDto.updateEntity(book);
        return bookMinInfoDto;
    }

    public BookMaxInfoDto updateBookMaxInfo(BookMaxInfoDto bookMaxInfoDto) {
        Book book = bookRepository.findBookById(bookMaxInfoDto.getId());
        book = bookMaxInfoDto.updateEntity(book);
        return bookMaxInfoDto;
    }

}
