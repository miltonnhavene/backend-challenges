package com.io.tiny.dev.library_api.repository;

import com.io.tiny.dev.library_api.entity.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
    Page<BookEntity> findByAuthor(String author, Pageable pageable);
    Page<BookEntity> findByPublisherYear(Integer year, Pageable pageable);
    Page<BookEntity> findByAuthorAndPublisherYear(String author, Integer year, Pageable pageable);
}