package com.demo.test;

import com.demo.pojo.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.Category;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });

		Product p = (Product) context.getBean("p");

		System.out.println(p.getName());
		System.out.println(p.getCategory().getName());
	}
}