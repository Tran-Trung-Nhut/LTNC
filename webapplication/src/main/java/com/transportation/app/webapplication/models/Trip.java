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
@Document(collection = "Trip")
public class Trip {

    @Id
    private String tripID;
    private String departureTime;
    private String departureLocation;
    private String arrivalLocation;
    private String estimatedArrivalTime;
    private String actualArrivalTime;
    private String currentStatus = "Chưa hoàn thành"; // Set default status to "Chưa hoàn thành"
    private String driverID; // ID của tài xế
}
