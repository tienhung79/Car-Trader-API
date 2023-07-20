package com.example.cartraderapi.service.account;

import com.example.cartraderapi.model.Account;

public interface IAccountService {
    Account findAccountByNameAccount(String name);
    Account saveAccount(Account account);
}
