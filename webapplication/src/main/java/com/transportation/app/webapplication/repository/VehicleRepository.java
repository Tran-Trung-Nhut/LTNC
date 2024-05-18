package com.transportation.app.webapplication.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.transportation.app.webapplication.models.Vehicle;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle, String> {
  @Query("{$or:[{'registeredNumber': {$regex: ?0, $options: 'i'}}, {'type': {$regex: ?0, $options: 'i'}}, {'status': {$regex: ?0, $options: 'i'}}]}")
  public List<Vehicle> searchVehicles(String search);
}
