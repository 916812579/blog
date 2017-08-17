package org.blog.service.impl;

import javax.annotation.Resource;

import org.blog.model.User;
import org.blog.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)  
//@ContextConfiguration({"classpath:spring-mybatis.xml"}) 
//由于本测试类位于src/test/java下，而app-context.xml处于src/main/java下，所以需要使用file来获取，
//否则使用@ContextConfiguration(locations={"classpath:WEB-INF/app-context.xml"})来获取
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/app-context.xml"})  
public class UserServiceImplTest extends TestCase {
	@Autowired UserService userService; 
	
	@Test
	public void test() {
		User user = userService.selectById(0);
		System.out.println(user.getEmail());
	}
}
