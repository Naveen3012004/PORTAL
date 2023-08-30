package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.UsersModel;
import com.example.demo.repository.UsersRepository;

@Service
public class UserService {
	@Autowired
	UsersRepository ur;
	public UsersModel add(UsersModel s) {
		return ur.save(s);
	}
	public List<UsersModel> showinfo(){
		return ur.findAll();
	}
	public UsersModel showById(int id) {
		return ur.findById(id).orElse(null);
	}
	public String deleteById(int id) {
		if(ur.findById(id).isPresent()) {
			ur.deleteById(id);
			return ("The Entered Id: "+id+" is deleted successfully");
		}else {
			return ("The Ented Id: "+id+" is not present");
		}
	}
	public UsersModel updateinfo(UsersModel s) {
		return ur.saveAndFlush(s);
	}
	public String deleteall() {
		ur.deleteAll();
		return("Deleted Successfully");
	}
	public List<UsersModel> showbySort(int page,int pagesize,String s){
		PageRequest pageable = PageRequest.of(page,pagesize,Sort.by(Sort.Direction.ASC,s));
		Page<UsersModel>userPage = ur.findAll(pageable);
		return userPage.getContent();
	}
	public List<UsersModel> findByName(String name){
		return ur.getbyfirstname(name);
	}
}
