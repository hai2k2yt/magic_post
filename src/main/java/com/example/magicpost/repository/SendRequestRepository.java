package com.example.magicpost.repository;

import com.example.magicpost.model.SendRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SendRequestRepository extends JpaRepository<SendRequest, Long> {
}
