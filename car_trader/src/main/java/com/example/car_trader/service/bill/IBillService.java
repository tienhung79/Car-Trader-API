package com.example.car_trader.service.bill;


import com.example.car_trader.model.Bill;
import com.example.car_trader.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBillService {

    void createBill(Bill bill);

    Bill getBillNew();

    List<Bill> getBillHistory(Integer customerId);
}
