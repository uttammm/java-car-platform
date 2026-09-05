package com.uttam.carp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String modelName;
    private int topSpeed;

    public Car(){}

    public Car(String brand, String modelName, int topSpeed){
        this.brand = brand;
        this.modelName = modelName;
        this.topSpeed = topSpeed;
    }

    public int getId(){
        return id;
    }

    public String getBrand(){
        return brand;
    }

    public String getModelName(){
        return modelName;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }

}
