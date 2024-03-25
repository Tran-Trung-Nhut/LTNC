package com.transportation.app.webapplication.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Document(collection = "Vehicle")
public class Vehicle {
    @Id
    private String id;
    private String size;
    private String loadCapacity;
    private String fuel;
    private String situation;
    private String type;
}
