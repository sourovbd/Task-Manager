package com.cardinity.task.manager.dto;

import com.cardinity.task.manager.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userName;
    private String password;
    private String userRole;

    public User to(UserDto userDto) {
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setUserRole(userDto.getUserRole());
        return user;
    }
}
