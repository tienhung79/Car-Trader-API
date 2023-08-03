package com.example.car_trader.service.customer.impl;


import com.example.car_trader.model.Customer;
import com.example.car_trader.repository.ICustomerRepository;
import com.example.car_trader.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;
    @Override
    public Customer findByAccount(String name) {
        return iCustomerRepository.findCustomerByAccount_AccountName(name);
    }
}
