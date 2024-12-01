package com.restJackson.dto;

import com.restJackson.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String email;
    private String password;
    private String username;
    private UserRole role;
    private AccountDTO account;
}
