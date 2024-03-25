package com.transportation.app.webapplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transportation.app.webapplication.models.Vehicle;
import com.transportation.app.webapplication.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> findAll(){
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle save(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteVehicle(Vehicle vehicle){
        vehicleRepository.delete(vehicle);
    }

    @Override
    public Optional<Vehicle> findByID(String id){
        return vehicleRepository.findById(id);
    }
}
