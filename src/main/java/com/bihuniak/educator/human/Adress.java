package com.bihuniak.educator.human;

import javax.persistence.Embeddable;

//@Embeddable
public class Adress {
    private String street;
    private String city;
    private String country;
    private String postCode;
    private Number number;


    public Adress(String street, String city, String country, String postCode, Number number) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postCode = postCode;
        this.number = number;
    }

    public Adress() {
    }
}
