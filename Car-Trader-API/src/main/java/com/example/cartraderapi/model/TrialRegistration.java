package com.example.cartraderapi.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class TrialRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trial_registration")
    private Integer idTrialRegistration;

    @Column(name = "date_of_trial_registration")
    private LocalDate dateOfRegistration;

    @Column(name = "status_trial_registration")
    private Boolean statusTrialRegistration;

    @ManyToOne
    @JoinColumn(name = "id_employee", referencedColumnName = "id_employee")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "id_product", referencedColumnName = "id_product")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id_customer", referencedColumnName = "id_customer")
    private Customer customer;

    public TrialRegistration() {
    }

    public TrialRegistration(Integer idTrialRegistration, LocalDate dateOfRegistration, Boolean statusTrialRegistration, Employee employee, Product product, Customer customer) {
        this.idTrialRegistration = idTrialRegistration;
        this.dateOfRegistration = dateOfRegistration;
        this.statusTrialRegistration = statusTrialRegistration;
        this.employee = employee;
        this.product = product;
        this.customer = customer;
    }

    public Integer getIdTrialRegistration() {
        return idTrialRegistration;
    }

    public void setIdTrialRegistration(Integer idTrialRegistration) {
        this.idTrialRegistration = idTrialRegistration;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public Boolean getStatusTrialRegistration() {
        return statusTrialRegistration;
    }

    public void setStatusTrialRegistration(Boolean statusTrialRegistration) {
        this.statusTrialRegistration = statusTrialRegistration;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
