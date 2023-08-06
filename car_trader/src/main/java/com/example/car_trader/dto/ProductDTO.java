package com.example.car_trader.dto;


import com.example.car_trader.model.Customer;
import com.example.car_trader.model.Employee;
import com.example.car_trader.model.ProductType;

public class ProductDTO {

    private Integer productId;

    private String productName;

    private Integer quantityOfProduct;
    private Integer quantity;

    private Integer price;



    public ProductDTO() {
    }

    public ProductDTO(Integer productId, String productName, Integer quantityOfProduct, Integer quantity, Integer price) {
        this.productId = productId;
        this.productName = productName;
        this.quantityOfProduct = quantityOfProduct;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(Integer quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
