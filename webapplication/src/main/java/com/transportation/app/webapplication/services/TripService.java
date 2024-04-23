package com.transportation.app.webapplication.services;

import com.transportation.app.webapplication.models.Driver;
import com.transportation.app.webapplication.models.Trip;

import java.util.List;

public interface TripService {
    public Trip save(Trip trip);
    public List<Trip> findAll();
    public Trip findByTripID(String tripID);
    public void deleteTrip(String tripID);
    public List<Driver> findAvailableDrivers();
    public Trip updateTrip(String tripID, Trip trip);
    public List<String> findAvailableRegisteredNumbers(); // Thêm phương thức mới
}