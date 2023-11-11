package com.example.magicpost.repository;

import com.example.magicpost.model.ProductDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDocumentRepository extends JpaRepository<ProductDocument, Long> {
}
