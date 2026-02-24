package org.akash.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	@Autowired
	Laptop laptop;
	public void writeCode() {
		System.out.println("coding...");
	}
	public void runCode() {
		laptop.compilation();
	}
}
