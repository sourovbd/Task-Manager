package com.cardinity.task.manager.service;

import com.cardinity.task.manager.entity.User;
import com.cardinity.task.manager.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        System.out.println(user.getUserRole());
        if (user.equals(null)) {
            throw  new UsernameNotFoundException("Username is not found.");
        }
        return new CustomUserDetails(user);
    }
}
