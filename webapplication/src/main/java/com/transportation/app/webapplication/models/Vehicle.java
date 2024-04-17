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
    private VehicleType type;
    private VehicleSize size;
    private double capacity;
    private String registeredNumber;
    private VehicleStatus status;

    public Vehicle(VehicleSize size, VehicleType type, double capacity, String registeredNumber, VehicleStatus status) {
        this.size = size;
        this.type = type;
        this.capacity = capacity;
        this.registeredNumber = registeredNumber;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public VehicleSize getSize() {
        return size;
    }

    public void setSize(VehicleSize size) {
        this.size = size;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getRegisteredNumber() {
        return registeredNumber;
    }

    public void setRegisteredNumber(String registeredNumber) {
        this.registeredNumber = registeredNumber;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
}
