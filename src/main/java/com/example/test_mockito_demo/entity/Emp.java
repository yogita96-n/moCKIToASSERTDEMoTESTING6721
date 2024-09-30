package com.example.test_mockito_demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "emp")
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "e_name", nullable = false)
    private String eName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "salary", nullable = false)
    private int salary;




    public Emp(String yogita, String mail, int salary) {
    }
}