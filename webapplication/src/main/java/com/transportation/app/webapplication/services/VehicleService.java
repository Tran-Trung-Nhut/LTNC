package com.transportation.app.webapplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.transportation.app.webapplication.models.Vehicle;

@Service
public interface VehicleService {
    public List<Vehicle> findAll();
    public Vehicle save(Vehicle vehicle);
    public void deleteVehicle(Vehicle vehicle);
    public Optional<Vehicle> findByID(String id);
    public List<Vehicle> searchVehicles(String registeredNumber);
}
