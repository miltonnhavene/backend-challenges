package com.io.tiny.dev.library_api.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Loans")
public class LoanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOAN_SEQUENCE")

    private Long id;
    private String nameClient;
    private LocalDate dueDate;
    private LocalDate loanDate;
    private LocalDate returnDate;
    private LoanStatus status;

    public LoanEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }
}
