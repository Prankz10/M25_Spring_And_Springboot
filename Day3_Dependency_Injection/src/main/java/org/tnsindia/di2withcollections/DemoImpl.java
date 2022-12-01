package org.tnsindia.di2withcollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoImpl {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		
		Cars def = (Cars) c.getBean("def");
		def.display();

	}
		

}