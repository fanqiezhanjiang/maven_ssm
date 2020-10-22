package com.lyj.dao;

import java.util.List;

import com.lyj.model.User;

public interface IUserDao {
	/*
	 * 根据用户名，查询用户
	 */
	public User loadByUsername(String username);
	
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
