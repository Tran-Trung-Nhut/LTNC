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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.transportation.app.webapplication.models.Trip;
import com.transportation.app.webapplication.services.TripService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/Trip")
public class TripController {

    @Autowired
    private TripService tripService;

    @GetMapping("/list")
    public List<Trip> getAllTrips() {
        return tripService.findAll();
    }

    @PostMapping("/add")
    public Trip addTrip(@RequestBody Trip trip) {
        return tripService.save(trip);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTrip(@PathVariable String id) {
        Optional<Trip> tripOptional = tripService.findByID(id);
        tripOptional.ifPresent(tripService::deleteTrip);
    }

    @PutMapping("/update")
    public Trip updateTrip(@RequestBody Trip trip) {
        return tripService.save(trip);
    }
}