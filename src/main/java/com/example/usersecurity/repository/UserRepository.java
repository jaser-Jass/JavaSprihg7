package com.example.usersecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.usersecurity.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByUsername(String username);
}