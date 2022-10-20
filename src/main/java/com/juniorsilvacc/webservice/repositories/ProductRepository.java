package com.juniorsilvacc.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorsilvacc.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
