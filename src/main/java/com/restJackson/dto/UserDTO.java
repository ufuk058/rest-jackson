package com.restJackson.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @JsonManagedReference //this field going to be serialised
    private AccountDTO account;
}
