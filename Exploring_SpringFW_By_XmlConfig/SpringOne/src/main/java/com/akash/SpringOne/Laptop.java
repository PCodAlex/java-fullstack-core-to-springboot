package com.akash.SpringOne;

public class Laptop implements Computer{
	@Override
	public void running() {
		System.out.println("running on laptop");
	}
}
