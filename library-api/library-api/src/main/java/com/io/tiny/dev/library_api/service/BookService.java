package com.io.tiny.dev.library_api.service;

import com.io.tiny.dev.library_api.dto.BookDTO;
import com.io.tiny.dev.library_api.entity.BookEntity;
import com.io.tiny.dev.library_api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface BookService {
    BookDTO createBook(BookDTO bookDTO);
}
