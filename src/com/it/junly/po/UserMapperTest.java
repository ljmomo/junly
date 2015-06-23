package com.it.junly.po;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;
import junit.framework.TestResult;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.it.junly.mapper.UserMapper;

public class UserMapperTest  extends TestCase{

private SqlSessionFactory sqlSessionFactory;
	
	protected void setUp() throws Exception {
		//mybatis配置文件
		String resource = "applicationContext-dao.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//使用SqlSessionFactoryBuilder创建sessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	
	public void testSelectUserById() throws Exception {
		//获取session
		SqlSession session = sqlSessionFactory.openSession();
		//获取mapper接口实例
		UserMapper userMapper = session.getMapper(UserMapper.class);
		//通过mapper接口调用statement
		User user = userMapper.selectUserById(1);
		System.out.println(user.getUsername());
		//关闭session
		session.close();
		
	}
public void testSelectUserList() throws Exception {
		//获取session
		SqlSession session = sqlSessionFactory.openSession();
		//获取mapper接口实例
		UserMapper userMapper = session.getMapper(UserMapper.class);
		//通过mapper接口调用statement
		List<User>list = userMapper.selectUserList();
		System.out.println(list);
		//关闭session
		session.close();
		
	}
public void testInsertUser() throws Exception {
		//获取session
		SqlSession session = sqlSessionFactory.openSession();
		//获限mapper接口实例
		UserMapper userMapper = session.getMapper(UserMapper.class);
		//要添加的数据
		User user = new User();
		user.setUsername("张三");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("北京市");
		user.setDetail("好同志");
		user.setScore(99.8f);
		//通过mapper接口添加用户
		userMapper.insertUser(user);
		//提交
		session.commit();
		//关闭session
		session.close();
	}
	public void testUpdateUser() throws Exception {
		//获取session
		SqlSession session = sqlSessionFactory.openSession();
		//获限mapper接口实例
		UserMapper userMapper = session.getMapper(UserMapper.class);
		//要更新的数据
		User user = new User();
		user.setId(7);
		user.setUsername("李四");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("北京市");
		user.setDetail("好同志");
		user.setScore(99.8f);
		//通过mapper接口调用statement
		userMapper.updateUser(user);
		//提交
		session.commit();
		//关闭session
		session.close();
	}
	public void testDeleteUser() throws Exception {
		//获取session
		SqlSession session = sqlSessionFactory.openSession();
		//获限mapper接口实例
		UserMapper userMapper = session.getMapper(UserMapper.class);
		//通过mapper接口删除用户
		userMapper.deleteUser(6);
		//提交
		session.commit();
		//关闭session
		session.close();
	}
}
