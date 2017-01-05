package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCkass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Theta airport = (Theta) context.getBean("Theta");
		airport.check();
		
		
		
	}

}
