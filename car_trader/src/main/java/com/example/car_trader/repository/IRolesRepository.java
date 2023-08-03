package com.example.car_trader.repository;


import com.example.car_trader.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRolesRepository extends JpaRepository<Roles, Integer> {
    Roles findByRolesName(String name);
}
