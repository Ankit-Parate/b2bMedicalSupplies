package com.b2b.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.b2b.dto.Approval;
import com.b2b.dto.User;
import com.b2b.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	
	@RequestMapping(value = "/loginGet", method = RequestMethod.GET)
	public String loginPage(Locale locale, Model model) {
		return "login";
	}
	
	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public String userValidation(@Validated User user, Model model) {
		System.out.println("Login Post called");
		/*
		User user1 = loginservice.validateUser(user);
		
		if(user1 != null)
		{
			model.addAttribute("userName",user.getUserName());
			return "pharmacyHome";
		}
		else {
			return "login";
		}
	}
	*/
		User user1 = loginservice.getUserType(user);
		
		//User user2 = loginservice.getUser(user1);
		//String userName = user2.getUserName();
		String userType = user1.getUserType().toString();
		
		if(userType.equals("admin"))
		{
			return "adminHome";
		}
		else if(userType.equals("pharmacy"))
		{
			return "pharmacyHome";
		}
		else if(userType.equals("manufacturer"))
		{
			return "manufacturerHome";
		}
		
		return "login";
		
	}
}
