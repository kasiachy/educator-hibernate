package com.bihuniak.educator.human;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    //@Embedded
    //private Adress adress;
    @ElementCollection
    private List<Adress> addresses = new ArrayList<>();
    @ElementCollection
    private List<String> phones = new ArrayList<>();

    public Human (){
    }

    public Human(long id, String firstName, String lastName, Sex sex, LocalDate birthDate, List<Adress> addresses, List <String> phones) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.addresses = addresses;
        this.phones = phones;
    }
}
