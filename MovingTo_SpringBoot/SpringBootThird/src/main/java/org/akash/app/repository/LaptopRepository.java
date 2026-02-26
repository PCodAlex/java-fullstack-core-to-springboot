package org.akash.app.repository;

import org.akash.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
	public void saveInDB(Laptop lap) {
		System.out.println("laptop object successfully saved in the database");
	}
}
