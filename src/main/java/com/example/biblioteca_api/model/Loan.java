package com.example.biblioteca_api.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@Entity
@Getter
@Setter
@AllArgsConstructor

public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)

    private Book book;
    private String customerName;
    private LocalDate loanDate;
    private LocalDate duedate;
    private LocalDate returnDate;
    private String status;  //em andamento, devolvido, atrasado..

}
