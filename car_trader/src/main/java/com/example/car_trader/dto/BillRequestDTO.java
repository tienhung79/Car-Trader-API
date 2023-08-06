package com.example.car_trader.dto;

import java.util.List;

public class BillRequestDTO {
    private List<ProductDTO> products;
    private String username;

    public BillRequestDTO(List<ProductDTO> products, String username) {
        this.products = products;
        this.username = username;
    }

    public List<ProductDTO> getproducts() {
        return products;
    }

    public void setproducts(List<ProductDTO> products) {
        this.products = products;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
