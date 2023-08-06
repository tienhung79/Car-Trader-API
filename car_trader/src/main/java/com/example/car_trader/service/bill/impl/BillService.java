package com.example.car_trader.service.bill.impl;

import com.example.car_trader.model.Bill;
import com.example.car_trader.repository.IBillRepository;
import com.example.car_trader.service.bill.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService implements IBillService {
@Autowired
    IBillRepository billRepository;
    @Override
    public void createBill(Bill bill) {
        billRepository.save(bill);
    }

    @Override
    public Bill getBillNew() {
        return billRepository.getBillNew();
    }
}
