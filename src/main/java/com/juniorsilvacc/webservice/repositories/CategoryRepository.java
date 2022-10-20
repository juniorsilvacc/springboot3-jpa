package com.juniorsilvacc.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorsilvacc.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
