package com.oputyk.librarywebapp.Author;

import com.oputyk.librarywebapp.Author.domain.AuthorFacade;
import com.oputyk.librarywebapp.Author.dto.AuthorMaxInfoDto;
import com.oputyk.librarywebapp.Author.dto.AuthorMinInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kamil on 14/01/2018.
 */
@RestController
@RequestMapping("api/author/")
public class AuthorController {
    private final AuthorFacade authorFacade;

    @Autowired
    public AuthorController(AuthorFacade authorFacade) {
        this.authorFacade = authorFacade;
    }

    @RequestMapping("all-max-info")
    public List<AuthorMaxInfoDto> getAllAuthorsMaxInfo() {
        return authorFacade.findAllMaxInfo();
    }

    @RequestMapping("all-min-info")
    public List<AuthorMinInfoDto> getAllAuthorsMinInfo() {
        return authorFacade.findAllMinInfo();
    }

    @RequestMapping(value = "update-max-info", method = RequestMethod.POST)
    public AuthorMaxInfoDto updateAuthorMaxinfo(@RequestBody AuthorMaxInfoDto authorMaxInfoDto) {
        return authorFacade.updateAuthorMaxInfo(authorMaxInfoDto);
    }

    @RequestMapping(value = "update-min-info", method = RequestMethod.POST)
    public AuthorMinInfoDto updateAuthorMinInfo(@RequestBody AuthorMinInfoDto authorMinInfoDto) {
        return authorMinInfoDto;
    }
}
