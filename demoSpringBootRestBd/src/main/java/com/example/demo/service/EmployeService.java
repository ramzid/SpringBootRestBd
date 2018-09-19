package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.persistance.dao.EmployeDao;
import com.example.demo.persistance.model.Employe;

@Service
@Transactional
public class EmployeService implements IEmployeService{
 
	@Autowired
	EmployeDao employeDao;
	
	@Override
	public void add(Employe employe) {
		// TODO Auto-generated method stub
		employeDao.save(employe);
	}

	@Override
	public void delete(Employe employe) {
		// TODO Auto-generated method stub
		employeDao.delete(employe);
	}

	@Override
	public void update(Employe employe) {
		// TODO Auto-generated method stub
		if(findOne(employe.getId())!=null)
		employeDao.save(employe);
	}

	@Override
	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return employeDao.findAll();
	}

	@Override
	public Employe findOne(int id) {
		// TODO Auto-generated method stub
		return employeDao.getOne(id);
	}

}
