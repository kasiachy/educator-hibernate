package com.bihuniak.educator.company;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String position;


    public Employee() {
    }

    public Employee(long id, String name, String position) {
        this.id =id;
        this.name = name;
        this.position = position;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

