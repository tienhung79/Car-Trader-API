package com.example.cartraderapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "car_type")
public class CarType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_type")
    private Integer idType;

    @Column(name = "name_type",columnDefinition = "Varchar(40)")
    private String nameType;

    @OneToMany(mappedBy = "carType",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Car> carSet;

    public CarType() {
    }

    public CarType(Integer idType, String nameType, Set<Car> carSet) {
        this.idType = idType;
        this.nameType = nameType;
        this.carSet = carSet;
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

    public Set<Car> getCarSet() {
        return carSet;
    }

    public void setCarSet(Set<Car> carSet) {
        this.carSet = carSet;
    }
}
