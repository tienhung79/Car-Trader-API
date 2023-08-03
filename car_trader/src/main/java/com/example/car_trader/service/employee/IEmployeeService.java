package com.example.car_trader.service.employee;


import com.example.car_trader.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService {

    Page<Employee> findAllEmployee(Pageable pageable);
}
