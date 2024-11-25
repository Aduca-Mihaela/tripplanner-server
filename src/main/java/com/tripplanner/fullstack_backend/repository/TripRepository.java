package com.tripplanner.fullstack_backend.repository;

import com.tripplanner.fullstack_backend.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findByUserId(Long userId);
}
