package org.akash.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootFirstApplication.class, args);
//		Alien a1=new Alien();
		Alien a1=context.getBean(Alien.class);
		a1.writeCode();
		a1.runCode();
	}
}
