package com.lyj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyj.dao.IUserDao;
import com.lyj.dao.impl.UserDao;
import com.lyj.model.User;
import com.lyj.service.IUserService;
import com.lyj.util.ERPException;
@Service
public class UserService implements IUserService{
	
//	@Autowired
//	private IUserService userService;
//	
//	@Override
//	public User login(User user) {
//		// TODO Auto-generated method stub
//		return userService.login(user);
//	}
	@Autowired
	private IUserDao userDao;

	@Override
	public User login(User user) throws ERPException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return userDao.list();
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}
	
//	@Override
//	public User login(User user) throws ERPException {
//		// 根据用户名查询，数据库是否有数据
//		User oldUser = userDao.loadByUsername(user.getUsername());
//		// 如果没有 说明用户不存在
//		if (oldUser == null) {
//			// throw 抛异常 会终止程序声明周期执行
//			throw new ERPException("用户名不存在");
//		}
//		// 如果有 就比较密码
//		// 不一致 说明密码不正确
//		if(!oldUser.getPassword().equals(user.getPassword())) {
//			throw new ERPException("密码不正确");
//		}
//		
//		// 一致 说明登录成功
//		return oldUser;
//	}
}
