package com.it.junly.utill;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionUtill {

	private static MySqlSessionUtill mySqlSessionUtill = null;

	/**
	 * 创建一个新的实例 MySqlSessionFactory.
	 * 
	 */
	private MySqlSessionUtill() {
	}

	// mybatis配置文件
	public static MySqlSessionUtill getSessionInstance() {
		SqlSession session = null;
		if (mySqlSessionUtill == null) {
			mySqlSessionUtill = new MySqlSessionUtill();
		}
		return mySqlSessionUtill;

	}

	public  SqlSession getSession() throws IOException {
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 使用SqlSessionFactoryBuilder创建sessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);
		// 通过session工厂获取一个Sqlsession，sqlsession中包括了对数据库操作的sql方法
		SqlSession session = sqlSessionFactory.openSession();
		return session;

	}
	
	

}
