package com.lyj.service;

import java.util.List;

import com.lyj.model.User;
import com.lyj.util.ERPException;

public interface IUserService {
	/*
	 * 登录方法
	 */
	public User login(User user) throws ERPException;
	
	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	public List<User> list();
	
	/**
	 * 添加用户,用户名不能重复
	 * 
	 * @param user
	 */
	public void add(User user);
}
