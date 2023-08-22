package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo er;
	public Employee saveinfo(Employee e) {
		return er.save(e);
	}
	public List<Employee> showinfo(){
		return er.findAll();
	}
}
