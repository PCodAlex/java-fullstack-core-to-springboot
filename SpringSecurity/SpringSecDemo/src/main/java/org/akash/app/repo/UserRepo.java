package org.akash.app.repo;

import org.akash.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer>{
	User findByUsername(String username);
}
