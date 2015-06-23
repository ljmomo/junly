package com.it.junly.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.it.junly.po.User;

public class UserDaoImpl implements UserDao {
	private SqlSessionFactory sqlSessionFactory;
	//注入SqlSessionFactory
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public User getUserById(int id) throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		User user = null;
		try {
			//通过sqlsession调用selectOne方法获取一条结果集
			//参数1：指定定义的statement的id,参数2：指定向statement中传递的参数
			user = session.selectOne("selectUserById", 1);
			System.out.println(user);
			//获取List
			//List<User> list = session.selectList("selectUserList");
			//System.out.println(list);
			
		} finally{
			session.close();
		}
		return user;
	}
	
	@Override
	public void insertUser(User user) throws Exception {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			session.insert("insertUser", user);
			session.commit();
		} finally{
			session.close();
		}
		
	}
	
	
}