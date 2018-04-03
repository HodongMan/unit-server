package com.unit.spring.user.repository;

import com.unit.spring.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByEmail(String email);
    User findByEmailAndPassword(String email, String password);
}