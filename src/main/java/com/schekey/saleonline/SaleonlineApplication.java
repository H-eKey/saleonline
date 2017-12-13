package com.schekey.saleonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * spring boot程序入口
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.schekey.saleonline.controller","com.schekey.saleonline.service","com.schekey.saleonline.mapper"})
public class SaleonlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaleonlineApplication.class, args);
	}
}
