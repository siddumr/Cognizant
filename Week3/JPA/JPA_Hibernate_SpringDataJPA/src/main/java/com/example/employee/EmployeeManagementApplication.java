package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {

    @Autowired
    private UniqueEmployeeService uniqueEmployeeService;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementApplication.class, args);
    }

   @Override
public void run(String... args) throws Exception {
    UniqueEmployee emp = new UniqueEmployee("Siddu", "Engineering");
    uniqueEmployeeService.insertUniqueEmployee(emp);
    System.out.println("Inserted employee: " + emp.getName());
}

}
