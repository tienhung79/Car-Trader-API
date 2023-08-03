package com.example.car_trader.repository;


import com.example.car_trader.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findCustomerByAccount_AccountName(String name);
//    @Query(value = "SELECT a.account_name FROM customer c JOIN account a ON c.account_id = a.account_id;", nativeQuery = true)
//    Customer findCustomerByAccount_AccountName(String name);
    Customer findCustomerByAccount_AccountId(int id);
}
