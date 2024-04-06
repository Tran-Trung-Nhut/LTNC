package com.transportation.app.webapplication.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.transportation.app.webapplication.models.Driver;

@Repository
public interface DriverRepository extends MongoRepository<Driver,String>{
   
    @Query("{$or:[{'name': {$regex: ?0, $options: 'i'}}, {'id_number': {$regex: ?0, $options: 'i'}}]}")
    public List<Driver> findByNameorID_Number(String regex);

    @Query("{'id_number': ?0}")
    public Driver findByID_Number(String id_number);

    @Query("{'license.grade': ?0}")
    public List<Driver> findByLicenseGrade(String grade);
}
