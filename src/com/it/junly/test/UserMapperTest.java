package com.it.junly.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.it.junly.mapper.UserMapper;
import com.it.junly.po.User;

public class UserMapperTest {
  private ApplicationContext applicationContext;
  
  @Before
  public void setUp() throws Exception
  {
	  applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
  }
   @Test
   public void testSelectUserById() throws Exception {
	 
	   
	    UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		//通过mapper接口调用statement
		User user = userMapper.selectUserById(1);
		System.out.println(user.getUsername());
		//关闭session
	
		
	}

}
