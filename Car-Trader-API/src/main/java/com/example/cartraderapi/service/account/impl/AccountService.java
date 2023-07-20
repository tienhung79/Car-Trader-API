package com.example.cartraderapi.service.account.impl;

import com.example.cartraderapi.model.Account;
import com.example.cartraderapi.repository.IAccountRepository;
import com.example.cartraderapi.service.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private IAccountRepository iAccountRepository;

    @Override
    public Account findAccountByNameAccount(String name) {
        Account account = iAccountRepository.findAccountByNameAccount(name);
        return account;
    }

    @Override
    public Account saveAccount(Account account) {
        return iAccountRepository.save(account);
    }

}
