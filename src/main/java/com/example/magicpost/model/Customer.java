package com.example.magicpost.model;


import jakarta.persistence.*;
import lombok.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String username;

  @Column(nullable = false)
  private String password;

  @Column(nullable = false)
  private String name;

  private String email;

  private String phoneNumber;

  @ManyToOne
  @JoinColumn(name = "ward_id", nullable = false)
  private Ward ward;

  private String addressDetail;
}



