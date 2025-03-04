package com.io.tiny.dev.library_api.repository;

import com.io.tiny.dev.library_api.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
