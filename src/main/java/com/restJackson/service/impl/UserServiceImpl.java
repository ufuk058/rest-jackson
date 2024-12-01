package com.restJackson.service.impl;

import com.restJackson.dto.UserDTO;
import com.restJackson.repository.UserRepository;
import com.restJackson.service.UserService;
import com.restJackson.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final MapperUtil mapperUtil;

    public UserServiceImpl(UserRepository userRepository, MapperUtil mapperUtil) {
        this.userRepository = userRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<UserDTO> getUsers() {
        return userRepository.findAll().stream().map(user -> mapperUtil.convert(user,new UserDTO())).collect(Collectors.toList());
    }
}
