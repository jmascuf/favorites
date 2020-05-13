package com.example.demo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

	public Optional<User> findByeMail(String eMail);
	
}
