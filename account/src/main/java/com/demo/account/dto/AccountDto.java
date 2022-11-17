package com.demo.account.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(name = "User resource information")
@Data
public class AccountDto {

    @Schema(description = "User account Balance")
    private String accountBalance;

    @Schema(description = "User name")
    private String name;

    @Schema(description = "User surname")
    private String surname;

    @Schema(description = "User address")
    private String address;
}
