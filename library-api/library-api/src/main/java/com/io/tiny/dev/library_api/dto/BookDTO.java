package com.io.tiny.dev.library_api.dto;

import com.io.tiny.dev.library_api.entity.BookEntity;

import java.math.BigDecimal;

public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private String publicationYear;
    private Integer numberPages;
    private BigDecimal price;

    public BookDTO() {
    }

    public BookDTO(String title, String publicationYear, String author, Integer numberPages, BigDecimal price) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
        this.numberPages = numberPages;
        this.price = price;
    }

    public BookDTO(BookEntity book) {
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.publicationYear = book.getPublisherYear();
        this.numberPages = book.getNumberPages();
        this.price = book.getPrice();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Integer getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(Integer numberPages) {
        this.numberPages = numberPages;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
