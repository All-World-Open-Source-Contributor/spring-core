package com.mbi.springprojects.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mbi.springprojects.springcore.bean.Employee;

public class Application {

	public static void main(String[] args) {

		// loading the definitions from the given XML file
				ApplicationContext context = new ClassPathXmlApplicationContext(
						"applicationContext.xml");
		 
				Employee service = (Employee) context
						.getBean("employee");
				String message = service.sayHello();
				System.out.println(message);
		 
				//set a new name
				service.setName("Arindam Mukherjee");
				message = service.sayHello();
				System.out.println(message);	
	
	
	}

}
