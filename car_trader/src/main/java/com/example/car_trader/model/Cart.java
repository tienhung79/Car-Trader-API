package com.example.car_trader.model;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCart;
    private Integer quantity;
    private boolean status = true;
    @ManyToOne
    @JoinColumn(columnDefinition = "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(columnDefinition = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id_bill", referencedColumnName = "id_bill")
    private Bill bill;
    public Cart() {
    }
    public Cart(Integer idCart, Integer quantity, boolean status, Customer customer, Product product, Bill bill) {
        this.idCart = idCart;
        this.quantity = quantity;
        this.status = status;
        this.customer = customer;
        this.product = product;
        this.bill = bill;
    }


    public Integer getIdCart() {
        return idCart;
    }

    public void setIdCart(Integer idCart) {
        this.idCart = idCart;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
