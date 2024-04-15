package com.transportation.app.webapplication.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.transportation.app.webapplication.models.Trip;

@Repository
public interface TripRepository extends MongoRepository<Trip, String> {
   
    @Query("{'tripID': ?0}")
    public Trip findByTripID(String tripID);
}