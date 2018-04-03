package com.unit.spring.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unit.spring.user.entity.User;
import com.unit.spring.user.repository.UserRepository;
import com.unit.spring.user.component.UserComponent;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {
    
    UserComponent userComponent;

    @Autowired
    UserController(UserComponent userComponent) {
        this.userComponent = userComponent;
    }

    @RequestMapping(value="", method=RequestMethod.GET)
    List<User> getUserList() {
        return userComponent.getUserList();
    }
}