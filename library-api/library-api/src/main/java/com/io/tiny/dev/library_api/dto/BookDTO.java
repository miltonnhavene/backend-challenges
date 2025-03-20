package com.io.tiny.dev.library_api.dto;

import com.io.tiny.dev.library_api.entity.BookEntity;

import java.math.BigDecimal;

public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private String publisherYear;
    private Integer numberPages;
    private BigDecimal price;

    public BookDTO() {
    }

    public BookDTO(String title, String author, String publisherYear, Integer numberPages, BigDecimal price) {
        this.title = title;
        this.author = author;
        this.publisherYear = publisherYear;
        this.numberPages = numberPages;
        this.price = price;
    }

    public BookDTO(BookEntity book) {
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.publisherYear = book.getPublisherYear();
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

    public String getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(String publisherYear) {
        this.publisherYear = publisherYear;
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
