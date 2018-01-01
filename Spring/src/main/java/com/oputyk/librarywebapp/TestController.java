package com.oputyk.librarywebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kamil on 01/01/2018.
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello!";
    }
}
