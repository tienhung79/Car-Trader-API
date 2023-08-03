package com.example.car_trader.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    private String productName;

    private String image;

    private String automatic;
    private String gpsNavigation;
    private String model;

    private Integer quantity;

    private String price;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDelete;


    @ManyToOne
    @JoinColumn(name="product_type_id", referencedColumnName = "product_type_id")
    private ProductType productType;

    public Product() {
    }

    public Product(Integer productId, String productName, String image, String automatic, String gpsNavigation, String model, Integer quantity, String price, Boolean isDelete, ProductType productType) {
        this.productId = productId;
        this.productName = productName;
        this.image = image;
        this.automatic = automatic;
        this.gpsNavigation = gpsNavigation;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
        this.isDelete = isDelete;
        this.productType = productType;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAutomatic() {
        return automatic;
    }

    public void setAutomatic(String automatic) {
        this.automatic = automatic;
    }

    public String getGpsNavigation() {
        return gpsNavigation;
    }

    public void setGpsNavigation(String gpsNavigation) {
        this.gpsNavigation = gpsNavigation;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
