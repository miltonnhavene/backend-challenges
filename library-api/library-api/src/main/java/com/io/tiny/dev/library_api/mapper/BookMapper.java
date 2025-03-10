package com.io.tiny.dev.library_api.mapper;

import com.io.tiny.dev.library_api.dto.BookDTO;
import com.io.tiny.dev.library_api.entity.BookEntity;

public class BookMapper {
    public static BookEntity toEntity(BookDTO dto) {
        if (dto == null) {
            return null;
        }
        BookEntity bookEntity = new BookEntity();
        bookEntity.setTitle(dto.getTitle());
        bookEntity.setAuthor(dto.getAuthor());
        bookEntity.setPublisherYear(dto.getPublicationYear());
        bookEntity.setNumberPages(dto.getNumberPages());
        bookEntity.setPrice(dto.getPrice());
        return bookEntity;
    }

    public static BookDTO toDTO(BookEntity entity) {
        if (entity == null) {
            return null;
        }
        return new BookDTO(
                entity.getTitle(),
                entity.getAuthor(),
                entity.getPublisherYear(),
                entity.getNumberPages(),
                entity.getPrice()
        );
    }
}
