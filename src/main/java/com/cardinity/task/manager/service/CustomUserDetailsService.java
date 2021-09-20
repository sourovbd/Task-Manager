package com.cardinity.task.manager.service;

import com.cardinity.task.manager.entity.User;
import com.cardinity.task.manager.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomUserDetailsService implements UserDetailsService {

    final Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUserName(username);

        logger.debug("Username: "+user.getUserName());
        logger.debug("Pass hash: "+user.getPassword());
        logger.debug("Role: "+user.getUserRole());

        if (user.equals(null)) {
            throw  new UsernameNotFoundException("Username is not found.");
        }
        return new CustomUserDetails(user);
    }
}
