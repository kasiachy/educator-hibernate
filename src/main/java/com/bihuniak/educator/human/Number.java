package com.bihuniak.educator.human;

import javax.persistence.Embeddable;

@Embeddable
public class Number {
private String buildingNumber;
private String apartmentNumber;

public Number (String buildingNumber, String apartmentNumber){
    this.buildingNumber = buildingNumber;
    this.apartmentNumber = apartmentNumber;

}

public Number() {
    }
}
