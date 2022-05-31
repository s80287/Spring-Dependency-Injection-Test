package org.htwdresden.informatik.SpringPKAdemo;

import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public Bean1 autowiredBean1() {
		Bean1 b1 = new Bean1();
		return b1;
	}
	
	@Bean
	public Bean2 autowiredBean2() {
		Bean2 b2 = new Bean2();
		return b2;
	}
	
}
