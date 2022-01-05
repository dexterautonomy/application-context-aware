package com.dexter.devops.services.impl;

import org.springframework.stereotype.Service;

import com.dexter.devops.services.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public void login(String value) {
		System.out.println("--->> 4");
		System.out.println("--->>: " + value);
	}
}
