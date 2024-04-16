package com.transportation.app.webapplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transportation.app.webapplication.models.Trip;
import com.transportation.app.webapplication.repository.TripRepository;

@Service
public class TripServiceImpl implements TripService {

    @Autowired
    private TripRepository tripRepository;

    @Override
    public Trip save(Trip trip) {
        return tripRepository.save(trip);
    }

    @Override
    public List<Trip> findAll() {
        return tripRepository.findAll();
    }

    @Override
    public Trip findByTripID(String tripID) {
        return tripRepository.findByTripID(tripID);
    }

    @Override
    public void deleteTrip(String tripID) {
        tripRepository.deleteById(tripID);
    }

    @Override
    public Optional<Trip> findByID(String id) {
        return tripRepository.findById(id);
    }

    @Override
    public Trip updateTrip(String tripID, Trip trip) {
        // Implement update logic here
        return tripRepository.save(trip);
    }
}
