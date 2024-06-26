package com.transportation.app.webapplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transportation.app.webapplication.models.Driver;
import com.transportation.app.webapplication.repository.DriverRepository;

@Service
public class DriverServiceImpl implements DriverService{

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Driver save(Driver driver){
        return driverRepository.save(driver);
    }

    @Override
    public Driver findByID_Number(String password){
        return driverRepository.findByID_Number(password);
    }
    
    @Override
    public List<Driver> findAll(){
        return driverRepository.findAll();
    }

    @Override
    public List<Driver> findByNameorID_number(String str){
        return driverRepository.findByNameorID_Number(str);
    }

    @Override
    public void deleteDriver(Driver driver){
        driverRepository.delete(driver);
    }

    @Override
    public List<Driver> findByLicenseGrade(String grade){
        return driverRepository.findByLicenseGrade(grade);
    }

    @Override
    public Optional<Driver> findByID(String id){
        return driverRepository.findById(id);
    }
}
