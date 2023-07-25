package com.example.cartraderapi.model;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_car")
    private Integer idCar;

    @Column(name = "name_car",columnDefinition = "Varchar(40)")
    private String nameCar;

    @Column(name = "description_car", columnDefinition = "MEDIUMTEXT")
    private String descriptionOfCar;

    @Column(name = "price_car", columnDefinition = "DOUBLE")
    private Double priceOfCar;

    @Column(name = "image_car", columnDefinition = "MEDIUMTEXT")
    private String imageOfCar;
    @Column(name = "quantity_car")
    private int quantityOfCar;

    @Column(name = "model_car", columnDefinition = "MEDIUMTEXT")
    private String modelOfCar;
    @Column(name = "automatic_car", columnDefinition = "MEDIUMTEXT")
    private String automaticOfCar;

    @ManyToOne
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    private CarType carType;

    public Car() {
    }

    public Car(Integer idCar, String nameCar, String descriptionOfCar, Double priceOfCar, String imageOfCar, int quantityOfCar, CarType carType) {
        this.idCar = idCar;
        this.nameCar = nameCar;
        this.descriptionOfCar = descriptionOfCar;
        this.priceOfCar = priceOfCar;
        this.imageOfCar = imageOfCar;
        this.quantityOfCar = quantityOfCar;
        this.carType = carType;
    }

    public Integer getIdCar() {
        return idCar;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getDescriptionOfCar() {
        return descriptionOfCar;
    }

    public void setDescriptionOfCar(String descriptionOfCar) {
        this.descriptionOfCar = descriptionOfCar;
    }

    public Double getPriceOfCar() {
        return priceOfCar;
    }

    public void setPriceOfCar(Double priceOfCar) {
        this.priceOfCar = priceOfCar;
    }

    public String getImageOfCar() {
        return imageOfCar;
    }

    public void setImageOfCar(String imageOfCar) {
        this.imageOfCar = imageOfCar;
    }

    public int getQuantityOfCar() {
        return quantityOfCar;
    }

    public void setQuantityOfCar(int quantityOfCar) {
        this.quantityOfCar = quantityOfCar;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
