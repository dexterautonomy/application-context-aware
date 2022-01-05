package com.dexter.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dexter.devops.tasks.PersonTask;

@RestController
@RequestMapping("api/v1")
public class HomeController {

	@GetMapping("home")
	public void home() throws Exception {
		System.out.println("--->> 1");
		
		new PersonTask().printUser("Chinedu");
	}
}
