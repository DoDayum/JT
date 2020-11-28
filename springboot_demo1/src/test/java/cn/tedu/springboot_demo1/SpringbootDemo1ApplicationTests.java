package cn.tedu.springboot_demo1;

import cn.tedu.springboot_demo1.service.Service1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemo1ApplicationTests {

	@Autowired
	private Service1 service;

	@Test
	void contextLoads() {

		service.test1();

	}

}
