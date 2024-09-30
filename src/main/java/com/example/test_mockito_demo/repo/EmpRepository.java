package com.example.test_mockito_demo.repo;

import com.example.test_mockito_demo.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Emp, Long> {
}