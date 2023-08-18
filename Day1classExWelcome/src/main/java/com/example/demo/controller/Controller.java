package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("disp")
	public String Welcome() {
		return "Welcome Spring Boot";
	}

	public String name = "IamNeo";
	@GetMapping("disp2")
	public String getName() {
		return "Welcome "+name+"!";
	}
	public String yourFavColor = "Pink";
	@GetMapping("disp3")
	public String getMyFav() {
		return "My favorite color is "+yourFavColor;
	}
}
