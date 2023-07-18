package com.example.cartraderapi.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_account")
    private Integer idAccount;

    @Column(name = "name_account",columnDefinition = "Varchar(40)",unique = true)
    private String nameAccount;

    @Column(name = "password", columnDefinition = "text")
    private String password;


    @OneToOne(mappedBy = "account")
    @JsonBackReference
    private Employee employee;
    @OneToOne(mappedBy = "account")
    @JsonBackReference
    private Customer customer;

    @OneToMany(mappedBy = "account")
    private Set<AccountRole> accountRoles = new HashSet<>();

    public Account() {
    }

    public Account(Integer idAccount, String nameAccount, String password, Employee employee, Customer customer, Set<AccountRole> accountRoles) {
        this.idAccount = idAccount;
        this.nameAccount = nameAccount;
        this.password = password;
        this.employee = employee;
        this.customer = customer;
        this.accountRoles = accountRoles;
    }

    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Set<AccountRole> getAccountRoles() {
        return accountRoles;
    }

    public void setAccountRoles(Set<AccountRole> accountRoles) {
        this.accountRoles = accountRoles;
    }
}