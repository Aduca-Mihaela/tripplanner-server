package com.tripplanner.fullstack_backend.controller;

import com.tripplanner.fullstack_backend.model.Destination;
import com.tripplanner.fullstack_backend.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/destinations")
public class DestinationController {

    private final DestinationRepository destinationRepository;

    @Autowired
    public DestinationController(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    // Endpoint pentru a crea o destinație
    @PostMapping
    public Destination createDestination(@RequestBody Destination destination) {
        return destinationRepository.save(destination);
    }

    // Endpoint pentru a obține toate destinațiile
    @GetMapping
    public List<Destination> getAllDestinations() {
        return destinationRepository.findAll();
    }
}

