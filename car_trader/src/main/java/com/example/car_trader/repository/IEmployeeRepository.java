package com.example.car_trader.repository;


import com.example.car_trader.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    @Override
    Page<Employee> findAll(Pageable pageable);
}
