package com.sc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.sc.mapper")
public class Crm3Application {

	public static void main(String[] args) {
		SpringApplication.run(Crm3Application.class, args);
	}

}
