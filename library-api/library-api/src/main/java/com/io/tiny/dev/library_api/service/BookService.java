package com.io.tiny.dev.library_api.service;

import com.io.tiny.dev.library_api.dto.BookDTO;
import com.io.tiny.dev.library_api.entity.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface BookService {
    BookDTO createBook(BookDTO bookDTO);
    Page<BookEntity> getAllBooks(String author, Integer year, Pageable pageable);
    Optional<BookEntity> getBookById(Long id);
    BookEntity updateBook(Long id, BookDTO bookDTO);
    void deleteBook(Long id);
}

