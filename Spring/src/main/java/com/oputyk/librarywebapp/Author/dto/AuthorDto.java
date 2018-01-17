package com.oputyk.librarywebapp.Author.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by kamil on 15/01/2018.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AuthorDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
}
