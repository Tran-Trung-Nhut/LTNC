package com.transportation.app.webapplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transportation.app.webapplication.models.Vehicle;
import com.transportation.app.webapplication.services.VehicleService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/Vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/list")
    public List<Vehicle> getVehicles(){
        return vehicleService.findAll();
    }

    @PostMapping("/add")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.save(vehicle);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDriver(@PathVariable String id){
        Optional<Vehicle> vehicleOptional = vehicleService.findByID(id);
         if (vehicleOptional.isPresent()) {
            Vehicle vehicle = vehicleOptional.get();
            vehicleService.deleteVehicle(vehicle);
        }
        
    }

    @PutMapping("/update")
    public Vehicle update(@RequestBody Vehicle vehicle){
        return vehicleService.save(vehicle);
    }
}