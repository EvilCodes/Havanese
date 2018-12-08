package org.havanese;

import org.havanese.pojo.User;
import org.havanese.service.ITestService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("org.havanese.mapper")
public class HavaneseApplication {

	@Autowired
	private static ITestService testService;

	public static void main(String[] args) {
		SpringApplication.run(HavaneseApplication.class, args);
		System.out.println("项目启动成功");

	}
}
