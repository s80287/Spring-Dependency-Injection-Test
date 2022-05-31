package org.htwdresden.informatik.SpringPKAdemo;

import static org.junit.Assert.assertEquals;

import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Bean1;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Bean2;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
  loader=AnnotationConfigContextLoader.class,
  classes=BeanConfiguration.class)
public class BeanAutowiredTest {

	@Autowired
	private Bean1 b1;
	
	@Autowired
	private Bean2 b2;
	
	@Test
	public void testBean2() {
		//Bean1 b1 = new Bean1();
		assertEquals("Bean2", b2.toString());
	}
	
	@Test
	public void testBean1() {
		assertEquals("Bean1 Bean2", b1.toString());
	}
	
}
