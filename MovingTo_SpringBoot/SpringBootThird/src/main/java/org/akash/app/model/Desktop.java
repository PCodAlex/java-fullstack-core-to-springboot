package org.akash.app.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
	@Override
	public void running() {
		System.out.println("Code run on : Desktop");
	}
}
