package com.akash.SpringTwo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{
	@Override
	public void running() {
		System.out.println("code running on : Laptop");
	}
}
