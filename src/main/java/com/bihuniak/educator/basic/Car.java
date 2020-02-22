package com.bihuniak.educator.basic;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    //@Access(value = AccessType.PROPERTY)
    private String model;
   // @Basic(optional = false)
    private String brand;
    private int wheels;
    @Column (name = "wowo")
    private double engineCapacity;
    private boolean secondHand;


    public Car(long id, String model, String brand, int wheels, double engineCapacity, boolean secondHand) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.wheels = wheels;
        this.engineCapacity = engineCapacity;
        this.secondHand = secondHand;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Car(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setSecondHand(boolean secondHand) {
        this.secondHand = secondHand;
    }


    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getWheels() {
        return wheels;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public boolean isSecondHand() {
        return secondHand;
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
        System.out.println("Hello from Car empty constructor");


    }
}