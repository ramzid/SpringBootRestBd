package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.persistance.model.Employe;
import com.example.demo.service.IEmployeService;

@RestController
public class EmployeController {

	@Autowired
	IEmployeService employeService;
	
	@GetMapping("/list")
	public List<Employe> findAll(){
		
		return employeService.findAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Employe emp) {
		employeService.add(emp);
	}
	@PutMapping("/update")
	public Employe update(@RequestBody Employe emp) {
		employeService.update(emp);
				return emp;
		
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
	Employe emp=	employeService.findOne(id);
		employeService.delete(emp);
	}
}
