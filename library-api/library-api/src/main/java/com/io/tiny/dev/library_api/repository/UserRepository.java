package com.io.tiny.dev.library_api.repository;

import com.io.tiny.dev.library_api.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
