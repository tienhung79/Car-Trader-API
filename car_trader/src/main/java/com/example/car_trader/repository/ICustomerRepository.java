package com.example.car_trader.repository;


import com.example.car_trader.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findCustomerByAccount_AccountName(String name);
}
