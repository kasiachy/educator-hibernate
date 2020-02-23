package com.bihuniak.educator.company;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String address;
    private int floor;

    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn
    private List<Employee> employee = new ArrayList<>();

    public Department() {
    }

    public Department(long id, String name, String address, int floor, List<Employee> employee) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.floor = floor;
        this.employee = employee;
    }

//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", floor=" + floor +
                ", employee=" + employee +
                '}';
    }
}

