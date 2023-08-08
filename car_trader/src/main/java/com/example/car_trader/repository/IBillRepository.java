package com.example.car_trader.repository;

import com.example.car_trader.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface IBillRepository extends JpaRepository<Bill, Integer> {
    @Query(value = "SELECT * FROM bill ORDER BY id_bill DESC LIMIT 1", nativeQuery = true)
    Bill getBillNew();
@Query(value = "select bill.* from bill join cart c on bill.id_bill = c.id_bill where c.customer_customer_id =:customerId",nativeQuery = true)
    List<Bill> getBillHistory(@Param("customerId") Integer customerId);
}
