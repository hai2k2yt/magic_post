package com.example.magicpost.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_fee")
public class OrderFee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne
  @JoinColumn(name = "order_id", nullable = false)
  private Order order;


  private double actualWeight;
  private double convertedWeight;
  private String deliveryType;
  private String orderType;
  private String specialService;
  private double mainFee;
  private double additionalFee;
  private double vat;
  private double totalFee;
  private double otherCharge;
  private double totalCharge;
  private double receiverChargeCOD;
  private double receiverOtherCharge;
  private double totalReceiverCharge;
}
