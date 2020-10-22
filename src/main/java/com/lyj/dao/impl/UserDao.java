package com.lyj.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.lyj.dao.IUserDao;
import com.lyj.model.User;
@Repository
public class UserDao extends SqlSessionDaoSupport implements IUserDao{
	
	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public User loadByUsername(String username) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(IUserDao.class).loadByUsername(username);
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(IUserDao.class).list();
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		getSqlSession().getMapper(IUserDao.class).add(user);
	}
	
	
}
