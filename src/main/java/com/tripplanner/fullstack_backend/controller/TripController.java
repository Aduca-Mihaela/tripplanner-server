package com.tripplanner.fullstack_backend.controller;

import com.tripplanner.fullstack_backend.model.Trip;
import com.tripplanner.fullstack_backend.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
public class TripController {

    private final TripRepository tripRepository;

    @Autowired
    public TripController(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    // Endpoint pentru crearea unei călătorii
    @PostMapping("/trip")
    public Trip createTrip(@RequestBody Trip trip) {
        return tripRepository.save(trip);
    }

    // Endpoint pentru a obține toate călătoriile
    @GetMapping("/trips")
    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    // Endpoint pentru a obține călătoriile unui utilizator specific
    @GetMapping("/user/{userId}")
    public List<Trip> getTripsByUser(@PathVariable Long userId) {
        return tripRepository.findByUserId(userId);
    }
}
