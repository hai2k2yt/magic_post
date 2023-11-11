package com.example.magicpost.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String orderCode;

  @Column(nullable = false)
  private String status;

  private LocalDateTime createTime;
  private LocalDateTime deliveryTime;
  private LocalDateTime completeTime;

  @ManyToOne
  @JoinColumn(name = "transaction_place_id", nullable = false)
  private TransactionPlace transactionPlace;

  @ManyToOne
  @JoinColumn(name = "customer_id", nullable = false)
  private Customer customer;

  @Column(nullable = false)
  private String receiverName;

  @Column(nullable = false)
  private String receiverPhoneNumber;

  @ManyToOne
  @JoinColumn(name = "ward_id", nullable = false)
  private Ward receiverAddress;

  private String receiverAddressDetail;
  private String message;
}
