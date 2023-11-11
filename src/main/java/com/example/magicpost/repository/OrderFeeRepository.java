package com.example.magicpost.repository;

import com.example.magicpost.model.OrderFee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderFeeRepository extends JpaRepository<OrderFee, Long> {
}
