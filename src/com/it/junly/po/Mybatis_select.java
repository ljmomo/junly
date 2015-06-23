package com.it.junly.po;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.it.junly.utill.MySqlSessionUtill;

public class Mybatis_select {
	public static void main(String[] args) throws IOException {
		Mybatis_select  mybatis_select = new Mybatis_select();
		mybatis_select.selectUser();
		//mybatis_select.insertUser();
    }
	
	
	public void selectUser() throws IOException
	{
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 使用SqlSessionFactoryBuilder创建sessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);
		// 通过session工厂获取一个Sqlsession，sqlsession中包括了对数据库操作的sql方法
		SqlSession session = sqlSessionFactory.openSession();
		User user = session .selectOne("test.selectUserById", 1);
		System.out.println("-----------"+user.getUsername()); 
	}
	
	
	/*public void insertUser() throws IOException
	{
		User user = new User();
		user.setUsername("张三");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("北京市");
		user.setDetail("好同志");
		user.setScore(99.8f);
		MySqlSessionUtill.getSessionInstance().getSession().insert("test.insertUser", user);
		MySqlSessionUtill.getSessionInstance().getSession().flushStatements();
		MySqlSessionUtill.getSessionInstance().getSession().commit();
	}*/
}