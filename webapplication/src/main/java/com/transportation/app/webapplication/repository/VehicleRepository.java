package com.transportation.app.webapplication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.transportation.app.webapplication.models.Vehicle;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle,String>{

}
