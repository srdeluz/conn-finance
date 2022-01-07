package com.pluzad.conn_finance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluzad.conn_finance.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
