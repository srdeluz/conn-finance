package com.pluzad.conn_finance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluzad.conn_finance.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
