package com.example.cartraderapi.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contract")
    private Integer idContract;
    @Column(name = "status_contract")
    private Boolean statusContract;

    @Column(name = "date_of_contract")
    private LocalDate dateOfContract;

    @Column(name = "deposit_amount", columnDefinition = "DOUBLE PRECISION")
    private Double depositAmount;

    @Column(name = "remaining_amount", columnDefinition = "DOUBLE PRECISION")
    private Double remainingAmount;

    @ManyToOne
    @JoinColumn(name = "id_employee", referencedColumnName = "id_employee")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "id_customer", referencedColumnName = "id_customer")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "id_car", referencedColumnName = "id_car")
    private Car car;

    public Contract() {
    }

    public Contract(Integer idContract, Boolean statusContract, LocalDate dateOfContract, Double depositAmount, Double remainingAmount, Employee employee, Customer customer, Car car) {
        this.idContract = idContract;
        this.statusContract = statusContract;
        this.dateOfContract = dateOfContract;
        this.depositAmount = depositAmount;
        this.remainingAmount = remainingAmount;
        this.employee = employee;
        this.customer = customer;
        this.car = car;
    }

    public Integer getIdContract() {
        return idContract;
    }

    public void setIdContract(Integer idContract) {
        this.idContract = idContract;
    }

    public Boolean getStatusContract() {
        return statusContract;
    }

    public void setStatusContract(Boolean statusContract) {
        this.statusContract = statusContract;
    }

    public LocalDate getDateOfContract() {
        return dateOfContract;
    }

    public void setDateOfContract(LocalDate dateOfContract) {
        this.dateOfContract = dateOfContract;
    }

    public Double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(Double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
