package com.example.car_trader.repository;

import com.example.car_trader.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.criteria.CriteriaBuilder;

public interface IBillRepository extends JpaRepository<Bill, Integer> {
    @Query(value = "SELECT * FROM bill ORDER BY id_bill DESC LIMIT 1", nativeQuery = true)
    Bill getBillNew();
}
