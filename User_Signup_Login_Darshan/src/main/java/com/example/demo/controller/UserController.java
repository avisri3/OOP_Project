package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.User;
import com.example.demo.dao.UserRepo;

@Controller
public class UserController {

	@Autowired
	UserRepo repo;
	
	@RequestMapping("/signin")
	public String signinOption()
	{
		return "signinOption.jsp";
		
	}
	
	@RequestMapping("/user_signin")
	
	
	public String userSignin()
	{
		return "userSignin.jsp";
	}
	
	
	@RequestMapping("/newUserRegistration")
	public String newUserRegistration(User user)
	{
		
		return "userRegistration.jsp";
		
	}
	
	
@RequestMapping("/admin_signin")
	
	@ResponseBody
	public String adminSignin()
	{
		return "Page Under Construction";
	}


	@RequestMapping("/getUser")
	
	@ResponseBody
	public String getUser()
	{
		return "Page Under Construction";
	}
	
	
	@RequestMapping("/registerUser")
	public String resgisterUser(User user)
	{
		repo.save(user);
		return "AfterUserReg.jsp";
	}

	
	
}
