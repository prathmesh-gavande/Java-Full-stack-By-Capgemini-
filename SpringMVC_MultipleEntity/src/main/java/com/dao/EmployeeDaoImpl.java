package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Repository("EmployeeDao")
public class EmployeeDaoImpl  implements EmployeeDao{
	
	@Autowired
	SessionFactory sessionfactory;
	
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		Session currentSession=sessionfactory.getCurrentSession();
		currentSession.save(employee);
		
	}
	
	
}
