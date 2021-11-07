package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	
@RequestMapping("/admin_signin")
	
	
	public String adminSignin()
	{
		return "adminSignin.jsp";
	}
}

