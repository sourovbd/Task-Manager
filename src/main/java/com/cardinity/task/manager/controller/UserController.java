package com.cardinity.task.manager.controller;

import com.cardinity.task.manager.dto.UserDto;
import com.cardinity.task.manager.entity.User;
import com.cardinity.task.manager.service.UserService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/save")
    public User save(@NonNull @RequestBody UserDto userDto) {
        User user = userDto.to(userDto);
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        return userService.save(user);
    }
}
