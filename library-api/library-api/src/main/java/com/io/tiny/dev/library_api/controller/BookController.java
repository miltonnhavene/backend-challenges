package com.io.tiny.dev.library_api.controller;


import com.io.tiny.dev.library_api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
@RequestMapping("/books")

public class BookController {
    @GetMapping("/")
    public String createBook(){
        return "Yebooo";
    }

}
