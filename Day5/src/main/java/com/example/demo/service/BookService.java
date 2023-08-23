package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookModel;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository Br;
	public BookModel saveinfo(BookModel s) {
		return Br.save(s);
	}
	public List<BookModel> show(){
		return Br.findAll();
	}
	public void deleteinfo(int id) {
		Br.deleteById(id);
	}
	public BookModel showinforeq(int id) {
		return Br.findById(id).orElse(null);
	}
	public String updateinfo(int id,BookModel s) {
		Optional<BookModel> bookInformation = Br.findById(id);
		if(bookInformation.isPresent()) {
			BookModel existingBook = bookInformation.get();
			existingBook.setBookName(s.getBookName());
			existingBook.setAuthorName(s.getAuthorName());
			existingBook.setPrice(s.getPrice());
			existingBook.setQuantity(s.getQuantity());
			Br.saveAndFlush(existingBook);
			return ("Data is found");
		}else {
			return ("Data is Not Available in the database");
		}
		
	}
}
