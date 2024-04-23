package com.transportation.app.webapplication.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Trip")
public class Trip {

    @Id
    private String tripID;
    private String departureTime;
    private String departureLocation;
    private String arrivalLocation;
    private String estimatedArrivalTime;
    private String actualArrivalTime;
    private String currentStatus;
    private String driverID;
    private VehicleType vehicleType; // Thêm trường Vehicle type
    private String registeredNumber; // Thêm trường Registered Number
    private double price; // Thêm trường Price
}
