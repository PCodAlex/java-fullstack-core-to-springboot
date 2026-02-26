package org.akash.app;

import org.akash.app.model.Laptop;
import org.akash.app.service.LaptopService;
//import org.akash.app.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootThirdApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootThirdApplication.class, args);
//		Alien alien =context.getBean(Alien.class);
//		alien.coding();
		Laptop lap=context.getBean(Laptop.class);
		lap.running();
		LaptopService laptopService=context.getBean(LaptopService.class);
		laptopService.addLaptop(lap);
	}
}  
