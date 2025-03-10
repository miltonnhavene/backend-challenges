package com.io.tiny.dev.library_api.dto;


import com.io.tiny.dev.library_api.entity.LoanEntity;

import java.time.LocalDate;

public class LoanDTO {
    private Long bookId;
    private Long userID;
    private LocalDate localDate;
    private LocalDate returnDate;
    private Boolean returned;

    public LoanDTO() {
    }

    public LoanDTO(Long bookId, Long userID, LocalDate localDate, LocalDate returnDate, Boolean returned) {
        this.bookId = bookId;
        this.userID = userID;
        this.localDate = localDate;
        this.returnDate = returnDate;
        this.returned = returned;
    }

    public LoanDTO(LoanEntity loan) {
        this.bookId = bookId;
        this.userID = userID;
        this.localDate = localDate;
        this.returnDate = returnDate;
        this.returned = returned;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Boolean getReturned() {
        return returned;
    }

    public void setReturned(Boolean returned) {
        this.returned = returned;
    }
}
