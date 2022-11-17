package com.demo.account.controller;

import com.demo.account.dto.AccountDto;
import com.demo.account.service.AccountService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Account Controller")
@RestController
@RequestMapping("/api/v1/user-accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @Operation(summary = "Get user account balance rest api")
    @PostMapping("/{userId}/{accountId}")
    public ResponseEntity<AccountDto> getUserAccountBalance(@PathVariable long userId, @PathVariable long accountId) {
        return accountService.getUserAccountBalance(userId, accountId);
    }
}
