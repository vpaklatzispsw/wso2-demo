package com.demo.account.service;

import com.demo.account.dto.AccountDto;
import org.springframework.http.ResponseEntity;

public interface AccountService {

    ResponseEntity<AccountDto> getUserAccountBalance(long userId, long accountId);
}
