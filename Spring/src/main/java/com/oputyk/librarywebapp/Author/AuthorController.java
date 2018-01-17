package com.oputyk.librarywebapp.Author;

import com.oputyk.librarywebapp.Author.domain.AuthorFacade;
import com.oputyk.librarywebapp.Author.domain.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kamil on 14/01/2018.
 */
@RestController
@RequestMapping("api/author/")
public class AuthorController {
    @Autowired
    AuthorFacade authorFacade;
}
