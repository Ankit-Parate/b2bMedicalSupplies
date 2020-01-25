package com.b2b.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.b2b.dto.Approval;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
	
	/*
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String login(@Validated User user, Model model) 
	{
		model.addAttribute("userName", user.getUserName());
		return "user";
	}
	*/
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(@Validated Approval approval, Model model) {
		model.addAttribute("userName", approval);
		return "register";
	}
	
}
