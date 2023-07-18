package com.example.cartraderapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private Integer idCustomer;

    @Column(name = "name_customer", columnDefinition = "Varchar(40)")
    private String nameCustomer;

    @Column(name = "phone_number", columnDefinition = "Varchar(15)", unique = true)
    private String phoneNumber;

    @Column(name = "image", columnDefinition = "MEDIUMTEXT")
    private String image;
    @Column(name = "address", columnDefinition = "Varchar(40)")
    private String address;
    @Column(name = "email", columnDefinition = "Varchar(40)")
    private String email;
    private boolean gender;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_account", referencedColumnName = "id_account")
    @JsonManagedReference
    private Account account;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Contract> contractSet;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<TrialRegistration> trialRegistrationSet;

    public Customer() {
    }

    public Customer(Integer idCustomer, String nameCustomer, String phoneNumber, String image, String address, String email, boolean gender, Account account, Set<Contract> contractSet, Set<TrialRegistration> trialRegistrationSet) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.phoneNumber = phoneNumber;
        this.image = image;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.account = account;
        this.contractSet = contractSet;
        this.trialRegistrationSet = trialRegistrationSet;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }

    public Set<TrialRegistration> getTrialRegistrationSet() {
        return trialRegistrationSet;
    }

    public void setTrialRegistrationSet(Set<TrialRegistration> trialRegistrationSet) {
        this.trialRegistrationSet = trialRegistrationSet;
    }
}
