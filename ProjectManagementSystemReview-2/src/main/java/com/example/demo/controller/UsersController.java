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

import com.example.demo.model.UsersModel;
import com.example.demo.service.UserService;

@RestController
public class UsersController {
	@Autowired
	UserService user;
	@PostMapping("add")
	public UsersModel add(@RequestBody UsersModel s) {
		return user.add(s);
	}
	@GetMapping("show")
	public List<UsersModel> showinfo(){
		return user.showinfo();
	}
	@GetMapping("id/{id}")
	public UsersModel showbyid(@PathVariable int id) {
		return user.showById(id);
	}
	@GetMapping("name/{name}")
	public List<UsersModel> showbyname(@PathVariable String name){
		return user.findByName(name);
	}
	@GetMapping("sort/{pgno}/{pgsize}/{s}")
	public List<UsersModel> sortbyinfo(@PathVariable int page,@PathVariable int pagesize, @PathVariable String name){
		return user.showbySort(page, pagesize, name);
	}
	@PutMapping("update")
	public UsersModel updateinfo(@RequestBody UsersModel s) {
		return user.updateinfo(s);
	}
	@DeleteMapping("delete")
	public void delete() {
		user.deleteall();
	}
	@DeleteMapping("delete/{id}")
	public void deletebyid(@PathVariable int id) {
		 user.deleteById(id);
	}
}
