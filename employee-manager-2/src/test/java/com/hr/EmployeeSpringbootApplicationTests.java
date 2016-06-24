package com.hr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.hr.EmployeeSpringbootApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EmployeeSpringbootApplication.class)
@WebAppConfiguration
public class EmployeeSpringbootApplicationTests {

	@Test
	public void contextLoads() {
	}

}
