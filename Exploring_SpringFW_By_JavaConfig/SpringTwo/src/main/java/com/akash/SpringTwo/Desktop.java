package com.akash.SpringTwo;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
	@Override
	public void running() {
		System.out.println("code running on : Desktop");
	}
}
