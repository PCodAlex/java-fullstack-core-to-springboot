package com.akash.SpringTwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
//	@Autowired
//	@Qualifier("desktop")
	private Computer com;
	@Value("21")
	private int money;

	public Computer getCom() {
		return com;
	}

	@Autowired
	@Qualifier("desktop")
	public void setCom(Computer com) {
		this.com = com;
	}
	
	public void working() {
		System.out.println("Alien Working :");
		com.running();
	}
}
