package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UniqueEmployeeService {

    @Autowired
    private UniqueEmployeeRepository uniqueEmployeeRepository;

    @Transactional
    public void insertUniqueEmployee(UniqueEmployee employee) {
        uniqueEmployeeRepository.save(employee);
    }
}
