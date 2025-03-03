package com.example.biblioteca_api.repository;
import com.example.biblioteca_api.model.Book;
import com.example.biblioteca_api.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LoanRepository extends JpaRepository<Loan, Long>{
}
