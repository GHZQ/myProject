package com.my;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.my.entity.User;
import com.my.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	UserMapper userMapper;
	@Test
	public void saveUser() {
		System.out.println(userMapper.save("李四", 11,"lisi","lisi@163.com")); 
	}
	
	@Test
	public void selectUser() {
		List<User> userList = userMapper.selectAll();
		for (User user : userList) {
			System.out.println(user); 
		}
	}
}


