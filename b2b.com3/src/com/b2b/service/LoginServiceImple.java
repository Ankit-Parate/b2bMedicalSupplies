package com.b2b.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.b2b.dao.UserDao;
import com.b2b.dto.User;

@Service
public class LoginServiceImple implements LoginService{

	@Autowired
	//private LoginService loginservice;
	private UserDao userdao;
	
	@Override
	public User getUserType(User user) {
		System.out.println("Entering getUserType");
		//User user1 = loginservice.getUserType(user);
		User user1 = userdao.getUserType(user);
		System.out.println("Leaving getUserType");
		return user1;
	}
	/*
	@Override
	public User getUser(User user) {
		System.out.println("Entering getUser");
		//User user2 = loginservice.getUser(user);
		User user2 = userdao.getUser(user);
		System.out.println("Leaving getUser");
		return user2;
	}
	*/
}