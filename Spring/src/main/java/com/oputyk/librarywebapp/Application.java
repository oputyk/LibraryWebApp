package com.oputyk.librarywebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Created by kamil on 01/01/2018.
 */

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
         SpringApplication.run(Application.class, args);
    }
}
