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

import com.transportation.app.webapplication.models.Driver;
import com.transportation.app.webapplication.services.DriverService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/Driver")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @GetMapping("/list")
    public List<Driver> getAllDriver(){
        return driverService.findAll();
    }

    @PostMapping("/add")
    public Driver addDriver(@RequestBody Driver driver){
        return driverService.save(driver);
    }

    @GetMapping("/")
    public List<Driver> findDriver(@RequestParam String str){
        return driverService.findByNameorID_number(str);
    }

    @GetMapping("/login")
    public Driver findByPass_Word(@RequestParam String password){
        return driverService.findByID_Number(password);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDriver(@PathVariable String id){
        Optional<Driver> driverOptional = driverService.findByID(id);
        if (driverOptional.isPresent()) {
            Driver driver = driverOptional.get();
            driverService.deleteDriver(driver);
        }
    }

    @PutMapping("/update")
    public Driver update(@RequestBody Driver driver){
        return driverService.save(driver);
    }
}
