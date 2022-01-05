package com.dexter.devops.tasks;

import com.dexter.devops.config.SpringContext;
import com.dexter.devops.services.LoginService;

public class PersonTask {
	private LoginService loginService;
	
	public void printUser(String user) {
		System.out.println("--->> 2");
		
		loginService = SpringContext.getBean(LoginService.class);
		
		loginService.login(user);
	}
}
