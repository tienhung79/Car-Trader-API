package com.example.car_trader.controller;


import com.example.car_trader.model.Employee;
import com.example.car_trader.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/employee")
public class EmployeeController {


    @Autowired
    private IEmployeeService iEmployeeService;


    @GetMapping("")
    public ResponseEntity<Page<Employee>> getAllEmployee(@PageableDefault(size = 5) Pageable pageable,
                                                         @RequestParam(value = "page", defaultValue = "0")
                                                         int page) {
        pageable = PageRequest.of(page, 5);
        Page<Employee> newsPage = iEmployeeService.findAllEmployee(pageable);
        return new ResponseEntity<>(newsPage, HttpStatus.OK);
    }
}
