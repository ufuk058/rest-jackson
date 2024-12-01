package com.restJackson.service;

import com.restJackson.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getUsers();
}
