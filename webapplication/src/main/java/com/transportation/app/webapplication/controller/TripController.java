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
        double price = calculatePrice(trip.getDepartureLocation(), trip.getArrivalLocation());
        trip.setPrice(price);
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

    // Hàm tính giá dựa trên điểm xuất phát và điểm đến
    private double calculatePrice(String departureLocation, String arrivalLocation) {
        // Logic tính toán giá ở đây
        // Đưa ra giả định về giá
        double price = 0.0;
        if (departureLocation.equals("Thành phố Hồ Chí Minh")) {
            if (arrivalLocation.equals("Miền nam")) {
                price = 3000000;
            } else if (arrivalLocation.equals("Miền trung")) {
                price = 20000000;
            } else if (arrivalLocation.equals("Miền bắc")) {
                price = 30000000;
            }
        } else if (departureLocation.equals("Đà Nẵng")) {
            if (arrivalLocation.equals("Miền nam")) {
                price = 20000000;
            } else if (arrivalLocation.equals("Miền trung")) {
                price = 3000000;
            } else if (arrivalLocation.equals("Miền bắc")) {
                price = 20000000;
            }
        } else if (departureLocation.equals("Hà Nội")) {
            if (arrivalLocation.equals("Miền nam")) {
                price = 30000000;
            } else if (arrivalLocation.equals("Miền trung")) {
                price = 20000000;
            } else if (arrivalLocation.equals("Miền bắc")) {
                price = 3000000;
            }
        }
        return price;
    }
}
