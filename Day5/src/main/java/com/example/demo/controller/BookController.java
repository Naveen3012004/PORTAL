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

import com.example.demo.model.BookModel;
import com.example.demo.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bser;
	@PostMapping("add")
	public BookModel add(@RequestBody BookModel s) {
		return bser.saveinfo(s);
	}
	@GetMapping("show")
	public List<BookModel> show(){
		return bser.show();
	}
	@GetMapping("/{id}")
	public BookModel showinfo(@PathVariable int id) {
		return bser.showinforeq(id);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		bser.deleteinfo(id);
	}
	@PutMapping("/{id}")
	public String updateinfo(@PathVariable int id,BookModel s) {
		return bser.updateinfo(id, s);
	}
}
