package com.transportation.app.webapplication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.transportation.app.webapplication.models.Trip;

import java.util.List;

@Repository
public interface TripRepository extends MongoRepository<Trip, String> {
   
    Trip findByTripID(String tripID);

    // Thêm phương thức để lấy danh sách biển số xe có sẵn
    List<String> findDistinctRegisteredNumberByCurrentStatus(String status);
}


