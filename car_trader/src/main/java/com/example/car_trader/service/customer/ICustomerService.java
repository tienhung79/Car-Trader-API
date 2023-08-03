package com.example.car_trader.service.customer;


import com.example.car_trader.model.Customer;

public interface ICustomerService {
    Customer findByAccount(String name);

}
