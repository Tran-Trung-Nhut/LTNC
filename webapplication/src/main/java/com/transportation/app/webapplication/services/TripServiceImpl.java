package com.transportation.app.webapplication.services;

import com.transportation.app.webapplication.models.Driver;
import com.transportation.app.webapplication.models.Trip;
import com.transportation.app.webapplication.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public List<Driver> findAvailableDrivers() {
        // Viết logic để tìm các tài xế có sẵn ở đây
        return null;
    }

    @Override
    public Trip updateTrip(String tripID, Trip trip) {
        // Implement logic để cập nhật Trip ở đây
        return tripRepository.save(trip);
    }

    @Override
    public List<String> findAvailableRegisteredNumbers() {
        // Truy vấn cơ sở dữ liệu để lấy danh sách các biển số xe có sẵn
        return tripRepository.findDistinctRegisteredNumberByCurrentStatus("AVAILABLE");
    }
}
