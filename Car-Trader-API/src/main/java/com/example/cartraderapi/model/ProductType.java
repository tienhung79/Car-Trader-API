package com.example.cartraderapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_type")
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_type")
    private Integer idType;

    @Column(name = "name_type",columnDefinition = "Varchar(40)")
    private String nameType;

    @OneToMany(mappedBy = "productType",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Product> productSet;

    public ProductType() {
    }

    public ProductType(Integer idType, String nameType, Set<Product> productSet) {
        this.idType = idType;
        this.nameType = nameType;
        this.productSet = productSet;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }
}
