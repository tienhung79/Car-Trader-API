package com.example.cartraderapi.repository;

import com.example.cartraderapi.model.Account;
import com.example.cartraderapi.model.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAccountRepository extends JpaRepository<AccountRole,Integer> {
    List<AccountRole> findByAccount(Account account);
}
