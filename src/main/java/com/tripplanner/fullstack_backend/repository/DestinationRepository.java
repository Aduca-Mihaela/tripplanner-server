package com.tripplanner.fullstack_backend.repository;

import com.tripplanner.fullstack_backend.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination, Long> {
}
