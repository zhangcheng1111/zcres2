package com.zctest.zctestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class ZctestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZctestDemoApplication.class, args);
	}

	@RequestMapping("/user/hello")
	public Object hello(){

		return  "hello world";
	}

}
