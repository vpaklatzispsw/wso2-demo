package com.demo.users.service;

import com.demo.users.dto.UserDto;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<UserDto> getUserDetails(long userId);
}

