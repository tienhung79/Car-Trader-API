package com.example.cartraderapi.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Integer idProduct;

    @Column(name = "name_product",columnDefinition = "Varchar(40)")
    private String nameProduct;

    @Column(name = "description_product", columnDefinition = "MEDIUMTEXT")
    private String descriptionOfProduct;

    @Column(name = "price_product", columnDefinition = "DOUBLE")
    private Double priceOfProduct;

    @Column(name = "image_product", columnDefinition = "MEDIUMTEXT")
    private String imageOfProduct;
    @Column(name = "quantity_product")
    private int quantityOfProduct;

    @ManyToOne
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    private ProductType productType;

    public Product() {
    }

    public Product(Integer idProduct, String nameProduct, String descriptionOfProduct, Double priceOfProduct, String imageOfProduct, int quantityOfProduct, ProductType productType) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.descriptionOfProduct = descriptionOfProduct;
        this.priceOfProduct = priceOfProduct;
        this.imageOfProduct = imageOfProduct;
        this.quantityOfProduct = quantityOfProduct;
        this.productType = productType;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionOfProduct() {
        return descriptionOfProduct;
    }

    public void setDescriptionOfProduct(String descriptionOfProduct) {
        this.descriptionOfProduct = descriptionOfProduct;
    }

    public Double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(Double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public String getImageOfProduct() {
        return imageOfProduct;
    }

    public void setImageOfProduct(String imageOfProduct) {
        this.imageOfProduct = imageOfProduct;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
