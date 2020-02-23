package com.bihuniak.educator.company;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String position;

    @OneToOne (cascade = CascadeType.ALL)
    private Department department;

    public Employee() {
    }

    public Employee(long id, String name, String position, Department department) {
        this.id =id;
        this.name = name;
        this.position = position;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", department=" + department +
                '}';
    }
}

