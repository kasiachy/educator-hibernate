package com.bihuniak.educator.human;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Human {

    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    @Enumerated(value = EnumType.STRING)
    private Sex sex;
    private LocalDate birthDate;
    @Embedded
    private Adress adress;

    public Human (){
    }

    public Human(long id, String firstName, String lastName, Sex sex, LocalDate birthDate, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.adress = adress;
    }
}
