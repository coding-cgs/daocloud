package com.example.daocloud;

import com.example.daocloud.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DaocloudApplicationTests {

	@Autowired
	private HelloService helloService;

	@Test
	void contextLoads() {
	}

	@Test
	void testAdd(){
		int sum = helloService.add(3, 5);
		assert sum == 8;
	}

}
