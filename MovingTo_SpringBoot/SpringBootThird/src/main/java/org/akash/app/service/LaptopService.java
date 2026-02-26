package org.akash.app.service;

import org.akash.app.model.Laptop;
import org.akash.app.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
	
	private LaptopRepository laptopRepo;
	
	public LaptopRepository getLaptopRepo() {
		return laptopRepo;
	}
	@Autowired
	public void setLaptopRepo(LaptopRepository laptopRepo) {
		this.laptopRepo = laptopRepo;
	}
	public void addLaptop(Laptop lap) {
		System.out.println("laptop added successfully...");
		laptopRepo.saveInDB(lap);
		
	}
	public boolean isGoodForProg(Laptop lap) {
		return true;
	}
}
