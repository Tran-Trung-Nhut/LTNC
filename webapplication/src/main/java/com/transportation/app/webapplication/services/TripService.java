package com.transportation.app.webapplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.transportation.app.webapplication.models.Trip;

@Service
public interface TripService {
    public Trip save(Trip trip);
    public List<Trip> findAll();
    public Trip findByTripID(String tripID);
    public void deleteTrip(Trip trip);
    public Optional<Trip> findByID(String id);
}