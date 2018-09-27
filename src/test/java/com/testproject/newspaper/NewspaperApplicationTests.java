package com.testproject.newspaper;

import com.testproject.entities.User;
import com.testproject.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewspaperApplicationTests {
     @Autowired
     private UserService userService;




	@Test
	public void testApi() {
        User user = new User();
        user.setName("roman");
        user.setAge(18);
	    userService.save(user);
		assertTrue(true);
	}



}
