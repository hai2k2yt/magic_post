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
@Table(name = "gathering_staff")
public class GatheringStaff {
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
  @JoinColumn(name = "gathering_place_id", nullable = false)
  private GatheringPlace gatheringPlace;

  private String email;

  @Column(nullable = false)
  private String role;
}
