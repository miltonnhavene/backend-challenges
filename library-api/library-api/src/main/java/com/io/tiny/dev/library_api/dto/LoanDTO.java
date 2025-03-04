package com.io.tiny.dev.library_api.dto;

import com.io.tiny.dev.library_api.entity.BookEntity;
import com.io.tiny.dev.library_api.entity.LoanEntity;

import java.time.LocalDate;

public class LoanDTO {
    private Long id;
    private String nameClient;
    private LocalDate dueDate;
    private LocalDate loanDate;
    private LocalDate returnDate;

    public LoanDTO() {

    }

    public LoanDTO(String nameClient, LocalDate dueDate, LocalDate loanDate, LocalDate returnDate) {
        this.nameClient = nameClient;
        this.dueDate = dueDate;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public LoanDTO(LoanEntity loan) {
        this.nameClient = loan.getNameClient();
        this.dueDate = loan.getDueDate();
        this.loanDate = loan.getLoanDate();
        this.returnDate = loan.getReturnDate();
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
