package com.transportation.app.webapplication.controller;

import com.transportation.app.webapplication.models.Trip;
import com.transportation.app.webapplication.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        tripService.deleteTrip(id);
    }

    @PutMapping("/update/{id}")
    public Trip updateTrip(@PathVariable String id, @RequestBody Trip updatedTrip) {
        return tripService.updateTrip(id, updatedTrip);
    }
}
