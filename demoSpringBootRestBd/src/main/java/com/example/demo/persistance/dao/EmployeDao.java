package com.example.demo.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.persistance.model.Employe;

public interface EmployeDao extends JpaRepository<Employe, Integer> {

}
