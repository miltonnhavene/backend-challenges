package com.io.tiny.dev.library_api.resource;

import com.io.tiny.dev.library_api.dto.BookDTO;
import com.io.tiny.dev.library_api.entity.BookEntity;
import com.io.tiny.dev.library_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping
    public ResponseEntity<Page<BookEntity>> getAllBooks(@RequestParam(required = false) String author, @RequestParam(required = false) Integer year, Pageable pageable) {
        Page<BookEntity> books = bookService.getAllBooks(author, year, pageable);
        if (books.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookEntity> getBookById(@PathVariable Long id){
        Optional<BookEntity> book = bookService.getBookById(id);

        if(book.isPresent()){
            return ResponseEntity.ok(book.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity <BookEntity> updateBook(@PathVariable Long id, @RequestBody BookDTO bookDTO){
        BookEntity updatedBook = bookService.updateBook(id, bookDTO);
        if(updatedBook == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }

}
