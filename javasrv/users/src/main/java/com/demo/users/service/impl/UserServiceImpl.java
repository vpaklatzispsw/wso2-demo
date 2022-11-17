package com.demo.users.service.impl;

import com.demo.users.dto.UserDto;
import com.demo.users.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public ResponseEntity<UserDto> getUserDetails(long userId) {
        UserDto userDto = new UserDto();

        if (userId == 1) {
            userDto.setName("John");
            userDto.setSurname("Doe");
            userDto.setAddress("Leof. Andrea Siggrou 199");
        } else if (userId == 2) {
            userDto.setName("Jane");
            userDto.setSurname("Doe");
            userDto.setAddress("Leof. Kifisias 27");
        } else {
            userDto.setName("Foo");
            userDto.setSurname("Bar");
            userDto.setAddress("Plateia Mavili");
        }

        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}
