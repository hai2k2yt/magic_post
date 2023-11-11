package com.example.magicpost.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transaction_place")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionPlace {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String code;

  @Column(nullable = false)
  private String name;

  @ManyToOne
  @JoinColumn(name = "ward_id", nullable = false)
  private Ward ward;

  private String addressDetail;

  @Column(nullable = false)
  private String postalCode;

}

