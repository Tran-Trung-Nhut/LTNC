package com.transportation.app.webapplication.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "Driver")
public class Driver {
    @Id
    private String id;
    private String name;
    private String id_number;
    private String dob;
    private String gender;
    private String phone_number;
    private License license;
    private String availability;
}
