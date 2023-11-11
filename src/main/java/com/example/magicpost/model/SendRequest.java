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
@Table(name = "send_request")
public class SendRequest {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "order_id", nullable = false)
  private Order order;

  private String orderImage;

  private String phoneNumber;

  private LocalDateTime createTime;

  @ManyToOne
  @JoinColumn(name = "transaction_staff_id")
  private TransactionStaff transactionStaff;
}
