package com.example.car_trader.controller;

import com.example.car_trader.model.Bill;
import com.example.car_trader.model.Customer;
import com.example.car_trader.model.Product;
import com.example.car_trader.security.jwt.JwtProvider;
import com.example.car_trader.security.jwt.JwtTokenFilter;
import com.example.car_trader.service.bill.IBillService;
import com.example.car_trader.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/user/customer")
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private JwtTokenFilter jwtTokenFilter;
    @Autowired
    private JwtProvider jwtProvider;
    @Autowired
    private IBillService billService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public Customer findCustomer(HttpServletRequest request){
        String token = jwtTokenFilter.getJwt(request);
        String name = jwtProvider.getUserNameFromToken(token);
        Customer customer = iCustomerService.findByAccount(name);
        return customer;
    }

}