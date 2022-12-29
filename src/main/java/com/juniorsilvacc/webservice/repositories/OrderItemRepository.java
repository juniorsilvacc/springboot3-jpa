package com.juniorsilvacc.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorsilvacc.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
