package com.cardinity.task.manager.service;

import com.cardinity.task.manager.entity.Project;
import com.cardinity.task.manager.entity.User;
import com.cardinity.task.manager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }
}
