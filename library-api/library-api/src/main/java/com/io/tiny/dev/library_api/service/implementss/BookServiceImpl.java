package com.io.tiny.dev.library_api.service.implementss;

import com.io.tiny.dev.library_api.dto.BookDTO;
import com.io.tiny.dev.library_api.entity.BookEntity;
import com.io.tiny.dev.library_api.mapper.BookMapper;
import com.io.tiny.dev.library_api.repository.BookRepository;
import com.io.tiny.dev.library_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    //➔	Registo de Livros
    public BookDTO createBook(BookDTO bookDto) {
        BookEntity book = BookMapper.toEntity(bookDto);
        BookEntity savedBook = bookRepository.save(book);
        return BookMapper.toDTO(savedBook);
    }

    //➔	Listagem de Livros
    public Page<BookEntity> getAllBooks(String author, Integer year, Pageable pageable) {
        if (author != null && year != null) {
            return bookRepository.findByAuthorAndPublisherYear(author, year, pageable);
        } else if (author != null) {
            return bookRepository.findByAuthor(author, pageable);
        } else if (year != null) {
            return bookRepository.findByPublisherYear(year, pageable);
        }
        return bookRepository.findAll(pageable);
    }

    //➔	Detalhes de um Livro
    public Optional<BookEntity> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    //➔	Atualização de Livro
    public BookEntity updateBook(Long id, BookEntity updatedBook) {
        return bookRepository.findById(id).map(book -> {
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setPublisherYear(updatedBook.getPublisherYear());
            book.setNumberPages(updatedBook.getNumberPages());
            book.setPrice(updatedBook.getPrice());
            return bookRepository.save(book);
        }).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }

    //➔	Exclusão de Livro
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
