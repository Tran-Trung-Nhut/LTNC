package com.transportation.app.webapplication.models;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Document(collection = "Driver")
public class Driver {

    @Id
    private String name;

    private String personal_ID;

    private String sex;

    public Driver(String n, String p, String s){
        this.name = n;
        this.personal_ID = p;
        this.sex = s;
    }

}
