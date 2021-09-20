package com.cardinity.task.manager.dto;

import com.cardinity.task.manager.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private PasswordEncoder passwordEncoder;

    private String userName;
    private String password;
    private String userRole;

    public User to(UserDto userDto) {
        User user = new User();
        String passwordHash = passwordEncoder.encode(userDto.getPassword());
        user.setUserName(userDto.getUserName());
        user.setPassword(passwordHash);
        user.setUserRole(userDto.getUserRole());
        return user;
    }
}
