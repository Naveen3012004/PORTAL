package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService eser;
	@PostMapping("add")
	public Employee add(@RequestBody Employee e) {
		return eser.saveinfo(e);
	}
	@GetMapping("show")
	public List<Employee> show(){
		return eser.showinfo();
	}
	
}
