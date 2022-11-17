package com.demo.account.service.impl;

import com.demo.account.dto.AccountDto;
import com.demo.account.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public ResponseEntity<AccountDto> getUserAccountBalance(long userId, long accountId) {
        AccountDto accountDto = new AccountDto();

        if (accountId == 1) {
            if (userId == 1) {
                accountDto.setAccountBalance("1000");
                accountDto.setName("John");
                accountDto.setSurname("Doe");
                accountDto.setAddress("Leof. Andrea Siggrou 199");
            } else if (userId == 2) {
                accountDto.setAccountBalance("2000");
                accountDto.setName("Jane");
                accountDto.setSurname("Doe");
                accountDto.setAddress("Leof. Kifisias 27");
            } else {
                accountDto.setAccountBalance("0");
                accountDto.setName("Foo");
                accountDto.setSurname("Bar");
                accountDto.setAddress("Plateia Mavili");
            }
        } else {
            if (userId == 1) {
                accountDto.setAccountBalance("300");
                accountDto.setName("John");
                accountDto.setSurname("Doe");
                accountDto.setAddress("Leof. Andrea Siggrou 199");
            } else if (userId == 2) {
                accountDto.setAccountBalance("800");
                accountDto.setName("Jane");
                accountDto.setSurname("Doe");
                accountDto.setAddress("Leof. Kifisias 27");
            } else {
                accountDto.setAccountBalance("1500");
                accountDto.setName("Foo");
                accountDto.setSurname("Bar");
                accountDto.setAddress("Plateia Mavili");
            }
        }

        return new ResponseEntity<>(accountDto, HttpStatus.OK);
    }
}
