package com.io.tiny.dev.library_api.resource;

import com.io.tiny.dev.library_api.dto.BookDTO;
import com.io.tiny.dev.library_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")

public class BookResource {

    @Autowired
    private BookService bookService;
    @PostMapping
    public ResponseEntity<BookDTO> createBook(@RequestBody BookDTO bookDTO) {
        BookDTO savedBook = bookService.createBook(bookDTO);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }
}
