package com.unit.spring.user.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.unit.spring.user.entity.User;
import com.unit.spring.user.repository.UserRepository;

@Component
public class UserComponent {
    
    @Autowired
    UserRepository userRepository;

    @Autowired
    public UserComponent(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(long id) {
        return userRepository.findById(id).get();
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email).get();
    }

    public List<User> getUserList() {
        return userRepository.findAll();
    }
}