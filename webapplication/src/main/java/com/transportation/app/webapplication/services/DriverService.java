
package com.transportation.app.webapplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.transportation.app.webapplication.models.Driver;
@Service
public interface DriverService {
    public Driver save(Driver driver);
    public List<Driver> findAll();
    public List<Driver> findByNameorID_number(String str);
    public void deleteDriver(Driver driver);
    public Optional<Driver> findByID(String id);
}
