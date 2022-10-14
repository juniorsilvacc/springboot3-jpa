package com.juniorsilvacc.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorsilvacc.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
