package com.example.employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UniqueEmployeeRepository extends JpaRepository<UniqueEmployee, Integer> {

}
