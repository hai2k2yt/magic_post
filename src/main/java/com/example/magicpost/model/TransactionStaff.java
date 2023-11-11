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
@Table(name = "transaction_staff")
public class TransactionStaff {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String username;

  @Column(nullable = false)
  private String password;

  @Column(nullable = false)
  private String name;

  @ManyToOne
  @JoinColumn(name = "transaction_point_id", nullable = false)
  private TransactionPlace transactionPoint;

  private String email;

  @Column(nullable = false)
  private String role;

}


