package com.b2b.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.b2b.dto.Approval;
import com.b2b.service.ApprovalService;

@Controller
public class RegistrationController {
	
	@Autowired
	private ApprovalService approvalService;
	
	@RequestMapping(value = "/registerGet", method = RequestMethod.GET)
	public String registerationPage(Locale locale, Model model) {
		return "register";
	}
	
	@RequestMapping(value = "/registerPost", method = RequestMethod.POST)
	public String afterRegistrationPage(@Validated Approval approval, Model model) {
		try
		{
			approvalService.insertUser(approval);
			return "register";
		}
		catch(Exception e)
		{
			return "login";
		}
	}
}
