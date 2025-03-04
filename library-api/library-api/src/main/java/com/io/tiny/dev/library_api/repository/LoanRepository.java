package com.io.tiny.dev.library_api.repository;

import com.io.tiny.dev.library_api.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<LoanEntity, Long> {

}
