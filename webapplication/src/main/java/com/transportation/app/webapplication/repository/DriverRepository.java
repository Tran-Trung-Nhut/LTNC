package com.transportation.app.webapplication.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.transportation.app.webapplication.models.Driver;

@Repository
public interface DriverRepository extends MongoRepository<Driver,String>{
   
    @Query("{$or:[{'name': {$regex: ?0, $options: 'i'}}, {'personal_ID': {$regex: ?0, $options: 'i'}}]}")
    public List<Driver> findByNameorID_Number(String str);

    @Query("{'personal_ID': ?0}")
    public Driver findByID_Number(String str);
}
