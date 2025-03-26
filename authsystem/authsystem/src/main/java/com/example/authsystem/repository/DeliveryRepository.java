package com.example.authsystem.repository;

import com.example.authsystem.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface DeliveryRepository extends JpaRepository<Delivery, UUID> {
}