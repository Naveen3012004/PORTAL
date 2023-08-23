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

import com.example.demo.model.Project;
import com.example.demo.service.ProjectService;

@RestController
public class ProjectController {
	@Autowired
	ProjectService pser;
	@PostMapping("add")
	public Project add(@RequestBody Project ps) {
		return pser.saveinfo(ps);
	}
	@GetMapping("show")
	public List<Project> show(){
		return pser.showinfo();
	}
	@GetMapping("/{id}")
	public Project showinforequired(@PathVariable int id) {
		return pser.showinforeq(id);
	}
	@PutMapping("update")
	public Project changeinfo(@RequestBody Project ps) {
		return pser.changeinfo(ps);
	}
	@PutMapping("/{id}")
	public Project updateinfo(@PathVariable int id,@RequestBody Project ps) {
		return pser.showinforeq(id);
	}
	@DeleteMapping("/{id}")
	public void deleteinfo(@PathVariable int id) {
		pser.deleteinfo(id);
	}
	@DeleteMapping("deleteall")
	public void delete() {
		pser.deleteAll();
	}
}
