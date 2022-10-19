package com.juniorsilvacc.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorsilvacc.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
