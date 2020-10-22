package com.lyj.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lyj.exception.SSMException;
import com.lyj.model.User;
import com.lyj.service.IUserService;
import com.lyj.util.ERPException;

@Controller
public class loginController {
	@Autowired
	private IUserService userService;

	@RequestMapping({ "/", "/login" })
	public String login() {
//		System.out.println(5555);
		return "login";
	}

	@RequestMapping("index")
	public String index1() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(User user, HttpSession session) throws SSMException, ERPException {
		User loginUser = userService.login(user);
		// 把登陆的信息保存到session中
		session.setAttribute("loginUser", loginUser);
		return "redirect:/index";
	}
}
