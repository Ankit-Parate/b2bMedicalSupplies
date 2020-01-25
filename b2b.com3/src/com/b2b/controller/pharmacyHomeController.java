package com.b2b.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.b2b.dto.Approval;

@Controller
public class pharmacyHomeController {
	
	@RequestMapping(value = "/pharmacyHomePage", method = RequestMethod.GET)
	public String pharmacyHomePage(Locale locale, Model model) {
		return "pharmacyHome";
	}
	
	@RequestMapping(value = "/pharmacyDetailsPageGet", method = RequestMethod.GET)
	public String pharmacyDetailsPage(Locale locale, Model model) {
		return "pharmacyDetails";
	}
	
	@RequestMapping(value = "/pharmacyDetailsPagePost", method = RequestMethod.POST)
	public String pharmacyDetailsPagePost(Locale locale, Model model) {
		
		return "pharmacyDetails";
	}
}
