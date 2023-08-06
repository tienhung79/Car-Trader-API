package com.example.car_trader.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bill")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bill")
    private Integer idBill;

    @Column(name = "day_of_bill",columnDefinition = "date")
    private LocalDate dayOfBill;
    @Column(name = "payment_status")
    private Boolean paymentStatus;
    private Integer totalOrders;

    public Bill() {
    }

    public Bill(Integer idBill, LocalDate dayOfBill, Boolean paymentStatus, Integer totalOrders) {
        this.idBill = idBill;
        this.dayOfBill = dayOfBill;
        this.paymentStatus = paymentStatus;
        this.totalOrders = totalOrders;
    }

    public Bill(LocalDate dayOfBill, Boolean paymentStatus, Integer totalOrders) {
        this.dayOfBill = dayOfBill;
        this.paymentStatus = paymentStatus;
        this.totalOrders = totalOrders;
    }

    public Integer getIdBill() {
        return idBill;
    }

    public void setIdBill(Integer idBill) {
        this.idBill = idBill;
    }

    public LocalDate getDayOfBill() {
        return dayOfBill;
    }

    public void setDayOfBill(LocalDate dayOfBill) {
        this.dayOfBill = dayOfBill;
    }

    public Boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(Integer totalOrders) {
        this.totalOrders = totalOrders;
    }
}
