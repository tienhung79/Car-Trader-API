package com.example.car_trader.service.account;


import com.example.car_trader.model.Account;

public interface IAccountService {

    Account findAccountByNameAccount(String name);
    Account saveAccount(Account account);

}
