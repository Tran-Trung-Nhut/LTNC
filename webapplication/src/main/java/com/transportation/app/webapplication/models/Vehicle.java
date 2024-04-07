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
    private VehicleSize size;
    private VehicleCapacity capacity;
    private enum Fuel {Gasoline, Gas, Diesel};
    private String type;
    private String regiNum;
    private enum Status {Ongoing, Maintenance, Waiting};

    public Vehicle(VehicleSize size, int goodCap, int peopleCap, Fuel fuelType, String type, String regiNum, Status status) {
        // this.id = id;
        this.size = size;
        this.capacity = new VehicleCapacity(goodCap, peopleCap);
        this.fuelType = fuelType;
        this.type = type;
        this.regiNum = regiNum;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public VehicleSize getSize() {
        return size;
    }

    public void setSize(VehicleSize size) {
        this.size = size;
    }

    public VehicleCapacity getCapacity() {
        return capacity;
    }

    public void setCapacity(VehicleCapacity capacity) {
        this.capacity = capacity;
    }

    public Fuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegiNum() {
        return regiNum;
    }

    public void setRegiNum(String regiNum) {
        this.regiNum = regiNum;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void checkStatus() {
        System.out.println("Current status: " + status);
    }

    public void updateInfo(String newRegiNum) {
        this.regiNum = newRegiNum;
        System.out.println("Vehicle information updated successfully!");
    }
}

public class Car extends Vehicle {
    private int numSeats;

}

public class Container extends Vehicle {
    private int maxLoad;
}

public class Truck extends Vehicle {
    private int maxLoadCapacity;
    private boolean isRefrigerated;
}





