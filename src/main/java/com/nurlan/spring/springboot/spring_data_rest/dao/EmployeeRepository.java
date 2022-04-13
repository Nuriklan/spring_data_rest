/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nurlan.spring.springboot.spring_data_rest.dao;



import com.nurlan.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nuriklan
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
