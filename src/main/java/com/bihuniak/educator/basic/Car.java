package com.bihuniak.educator.basic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String model;
    private String brand;
    private int wheels;
    private double engineCapacity;
    private boolean secondHand;


    public Car(String model, String brand, int wheels, double engineCapacity, boolean secondHand) {
        this.model = model;
        this.brand = brand;
        this.wheels = wheels;
        this.engineCapacity = engineCapacity;
        this.secondHand = secondHand;
    }



    public Car(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", wheels=" + wheels +
                ", engineCapacity=" + engineCapacity +
                ", secondHand=" + secondHand +
                '}';
    }

    public Car() {


    }
}