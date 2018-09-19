package com.example.demo.service;

import java.util.List;

import com.example.demo.persistance.model.Employe;

public interface IEmployeService {
	
	public void add(Employe employe);
	public void delete(Employe employe);
	public void update(Employe employe);
	public List<Employe> findAll();
	public Employe findOne(int id);

}
