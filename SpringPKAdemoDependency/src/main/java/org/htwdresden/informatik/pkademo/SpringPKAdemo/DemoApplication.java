package org.htwdresden.informatik.pkademo.SpringPKAdemo;

import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Bean1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
			SpringApplication.run(DemoApplication.class, args);
	
		Bean1 b1 = context.getBean(Bean1.class);
		
		System.out.println(b1.toString());
	}
	
}
