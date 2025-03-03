package com.example.biblioteca_api.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private Integer publicationYear;
    private Integer pages;
    private Double price;
    private String status;

}
