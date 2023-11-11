package com.example.magicpost.repository;

import com.example.magicpost.model.OrderTracking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTrackingRepository extends JpaRepository<OrderTracking, Long> {
}
