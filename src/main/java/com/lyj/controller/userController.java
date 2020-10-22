package com.lyj.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lyj.model.User;
import com.lyj.service.IUserService;

@Controller
@RequestMapping("/user")
public class userController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/list")
	public String list(HttpSession session, Model model){
		List<User> listUser = userService.list();
		model.addAttribute("listUser",listUser);
		return "user/list";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(HttpSession session, User user){
		userService.add(user);
		return "user/add";
	}
}
