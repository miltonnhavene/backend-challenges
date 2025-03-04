package com.io.tiny.dev.library_api.mapper;

import com.io.tiny.dev.library_api.dto.BookDTO;
import com.io.tiny.dev.library_api.entity.BookEntity;

public class BookMapper {
    public BookEntity toEntity(BookDTO dto) {
        if (dto == null) {
            return null;
        }
        BookEntity entity = new BookEntity();
        entity.setTitle(dto.getTitle());
        entity.setAuthor(dto.getAuthor());
        entity.setPublisherYear(dto.getPublicationYear());
        entity.setNumberPages(dto.getNumberPages());
        entity.setPrice(dto.getPrice());
        return entity;
    }

    public BookDTO toDTO(BookEntity entity) {
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
